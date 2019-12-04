package com.example.demo.design.adapter.inter.impl;

import com.example.demo.design.adapter.inter.Ac;

/**
 * @author GEEX177
 * @date 2019/12/3
 */
public class Ac220 implements Ac {

    private static final int OUTPUT_220 = 220;

    @Override
    public int outputAc() {
        return OUTPUT_220;
    }
}
