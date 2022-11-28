package cvsserver.server.Entity;

import lombok.Data;

@Data
public class StockRequest {
    private String code;

    /**
     * 1: by day
     * 2: by month
     * 3: by year
     * 4: by 5 years
     */
    private int type;
}
