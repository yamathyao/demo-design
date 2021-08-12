package com.example.demo.design.command.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public Broker() {
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
