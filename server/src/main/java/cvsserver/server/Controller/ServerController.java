package cvsserver.server.Controller;

import cvsserver.server.Entity.Stock;
import cvsserver.server.Entity.StockRequest;
import cvsserver.server.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("/favourite-list")
    public List<Stock> getFavouriteListStocks() {
        return Stock.getMockListStocks();
    }

    @PostMapping("/stock")
    public List<Stock> getStocks(@RequestBody StockRequest stockRequest) {
        var stocks = serverService.getStockByDefault(stockRequest.getCode());
        return stocks;
    }
}
