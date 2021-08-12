package com.example.demo.design.adapter;

import com.example.demo.design.adapter.inter.Car;

/**
 * i'm a driver, can drive a car
 *
 * @author yao
 * @date 2019/12/3
 */
public class Driver implements Car {

    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}
