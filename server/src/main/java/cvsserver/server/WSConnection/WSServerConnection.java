package cvsserver.server.WSConnection;

import cvsserver.server.Entity.ServerWrapper;
import cvsserver.server.Entity.Stock;
import io.socket.socketio.server.SocketIoNamespace;
import io.socket.socketio.server.SocketIoServer;
import io.socket.socketio.server.SocketIoSocket;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.Timer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class WSServerConnection {
    private Map<String, Set<SocketIoSocket>> mRoomSockets = new ConcurrentHashMap<>();

//    @Bean
//    public void serverConnection2() {
//        var serverWrapper = new ServerWrapper();
//        try {
//            serverWrapper.startServer();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        SocketIoServer server = serverWrapper.getSocketIoServer();
//        SocketIoNamespace ns = server.namespace("/");
//        final AtomicReference<Timer> timer = new AtomicReference<>(new Timer(1000, actionEvent -> {
//            var mockList = Stock.getMockListStocks();
//            var randomIndex = new Random().nextInt(mockList.size());
//            var randomMath = new Random().nextInt(2);
//            var stock = mockList.get(randomIndex);
//            stock.setCurrent(randomMath == 1 ? stock.getCurrent() + 100 : stock.getCurrent() - 100);
//            System.out.println("Send to favorite-list: " + stock.toString());
//            ns.broadcast("ResetInterval", "favorite-list", stock.toString());
//        }));
//        timer.get().start();
//
//        ns.on("connection", arg -> {
//            var socket = (SocketIoSocket) arg[0];
//            System.out.println("-------------------------------------------------------------------");
//            System.out.println("Socket connected: " + socket.getId() + "|" + socket.getConnectData());
//            System.out.println("-------------------------------------------------------------------");
//            socket.joinRoom("ResetInterval");
//
//           socket.on("reset-interval", args2 -> {
//               timer.get().stop();
//               var timeInterval = Integer.valueOf(args2[0].toString());
//               timer.set(new Timer(timeInterval, actionEvent -> {
//                   ns.broadcast("ResetInterval", "favorite-list", "Hello");
//               }));
//               timer.get().start();
//           });
//        });
//    }

    @Bean
    public SocketIoSocket serverConnection() {
        var serverWrapper = new ServerWrapper();
        try {
            serverWrapper.startServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        SocketIoServer server = serverWrapper.getSocketIoServer();
        SocketIoNamespace ns = server.namespace("/");
        final AtomicReference<SocketIoSocket> socket = new AtomicReference<SocketIoSocket>();
        final AtomicReference<Timer> timer = new AtomicReference<Timer>();
        var setSocket = new HashSet<SocketIoSocket>();
        mRoomSockets.put("ResetInterval", setSocket);
        var listTimer = new ArrayList<Timer>();
        ns.on("connection", args12 -> {
            socket.set((SocketIoSocket) args12[0]);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Socket connected: " + socket.get().getId());
            socket.set((SocketIoSocket) args12[0]);
            System.out.println("-------------------------------------------------------------------");
            setSocket.add(socket.get());
//            socket.get().joinRoom("ResetInterval");

//            for (var socketTest : list) {
//                socketTest.joinRoom("ResetInterval");
//            }
            System.out.println("Client " + socket.get().getId() + " (" + socket.get().getInitialHeaders().get("remote_addr") + ") has connected.");
            initTimeInverval(timer, 1000, socket.get(), ns);
            timer.get().start();

            socket.get().on("interval", args1 -> {
                //Reset timer with new interval time
                timer.get().stop();
                var timeInterval = Integer.valueOf(args1[0].toString());
                System.out.println("[Client " + socket.get().getId() + " send time interval] " + timeInterval);
                initTimeInverval(timer, timeInterval, socket.get(), ns);
                timer.get().start();
            });

            socket.get().on("cancel", args2 -> {
                System.out.println("[Client " + socket.get().getId() + " cancel interval] ");
                timer.get().stop();
            });

            socket.get().on("disconnect", args3 -> {
                System.out.println("[Client " + socket.get().getId() + " disconnect] ");
                timer.get().stop();
            });

            socket.get().on("reset-interval", arg3 -> {
                var timeInterval = Integer.valueOf(arg3[0].toString());
                System.out.println("Client " + socket.get().getId() + " reset interval: " + timeInterval);
                timer.get().stop();
                System.out.println("[Client " + socket.get().getId() + " send time interval] " + timeInterval);
                initTimeInverval(timer, timeInterval, socket.get(), ns);
                timer.get().start();
            });

            ns.on("interval", arg4 -> {
                timer.get().stop();
                var timeInterval = Integer.valueOf(arg4[0].toString());
                System.out.println("[Client " + socket.get().getId() + " send time interval] " + timeInterval);
                initTimeInverval(timer, timeInterval, socket.get(), ns);
                timer.get().start();
            });
        });

        return socket.get();
    }

    private void initTimeInverval(AtomicReference<Timer> timer, int timeInterval,
                                  SocketIoSocket socket, SocketIoNamespace ns) {
        timer.set(new Timer(timeInterval, actionEvent -> {
            var mockList = Stock.getMockListStocks();
            var randomIndex = new Random().nextInt(mockList.size());
            var randomMath = new Random().nextInt(2);
            var stock = mockList.get(randomIndex);
            stock.setCurrent(randomMath == 1 ? stock.getCurrent() + 100 : stock.getCurrent() - 100);
            System.out.println("Send to favorite-list: " + "Hi".getBytes(StandardCharsets.UTF_8));
            var iterator = mRoomSockets.get("ResetInterval").iterator();

            while(iterator.hasNext()) {
                var socketConnect = iterator.next();
                socketConnect.send("favorite-list", "Hi".getBytes(StandardCharsets.UTF_8));
            }
//            ns.broadcast("ResetInterval", "favorite-list", "Hi".getBytes(StandardCharsets.UTF_8));
//            socket.send("favorite-list", stock.toString().getBytes(StandardCharsets.UTF_8));
        }));
    }
}
