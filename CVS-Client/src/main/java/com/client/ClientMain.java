package com.client;

import io.socket.client.IO;
import io.socket.client.Socket;
import java.net.URISyntaxException;

public class ClientMain {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = IO.socket("ws://localhost:9093");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        socket.on("favorite-list", objects -> {
            System.out.println("Receive msg: " + objects[0].toString());
        });

        socket.connect();

    }
}
