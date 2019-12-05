package com.example.demo.design.command.order;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class MainApplication {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        Order buyOrder = new BuyStock(abcStock);
        Order sellOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
