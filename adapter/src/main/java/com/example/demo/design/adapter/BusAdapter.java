package com.example.demo.design.adapter;

import com.example.demo.design.adapter.inter.Car;

/**
 * bus adapter
 *
 * @author yao
 * @date 2019/12/3
 */
public class BusAdapter extends Bus implements Car {

    @Override
    public void drive() {
        super.run();
    }
}
