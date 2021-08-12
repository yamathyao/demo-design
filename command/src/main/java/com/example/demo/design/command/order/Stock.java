package com.example.demo.design.command.order;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/5
 */
@Slf4j
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        log.info("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought.");
    }

    public void sell() {
        log.info("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold.");
    }
}
