package com.example.demo.design.command.order;

/**
 * @author GEEX177
 * @date 2019/12/5
 */

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
