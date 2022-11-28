package cvsserver.server.Service;

import cvsserver.server.Entity.Stock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class ServerService {

    // Get 50 stocks by code
    public List<Stock> getStockByDefault(String code) {
        var stocks = Stock.getMockListStocks();
        var stock = stocks.stream().filter(value -> value.getCode().equals(code)).findFirst().orElse(null);
        if (stock == null) {
            return Collections.emptyList();
        }

        var resultList = new ArrayList<Stock>();
        for (var index = 0; index < 50; index++) {
            try {
                var mockStock = (Stock) stock.clone();
                var randomMath = new Random().nextInt(2);
                mockStock.setCurrent(randomMath == 1 ? stock.getCurrent() + 100 * index
                        : stock.getCurrent() - 100 * index);
                var randomOpen = new Random().ints(100000000, 900000000).findFirst().getAsInt();
                mockStock.setOpen(randomOpen);
                var randomClose = new Random().ints(100000000, 900000000).findFirst().getAsInt();
                mockStock.setClose(randomClose);
                mockStock.setDate(System.currentTimeMillis());
                resultList.add(mockStock);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return Collections.emptyList();
            }
        }
        return resultList;
    }
}
