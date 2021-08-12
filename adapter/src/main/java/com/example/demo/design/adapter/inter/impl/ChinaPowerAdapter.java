package com.example.demo.design.adapter.inter.impl;

import com.example.demo.design.adapter.inter.Ac;
import com.example.demo.design.adapter.inter.DC5Adapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/3
 */
@Slf4j
public class ChinaPowerAdapter implements DC5Adapter {

    private static final int VOLTAGE = 220;

    @Override
    public boolean support(Ac ac) {
        return (VOLTAGE == ac.outputAc());
    }

    @Override
    public int outputDC5V(Ac ac) {
        int adapterInput = ac.outputAc();
        int adapterOutput = adapterInput / 44;
        log.info("China Power Adapter, Input " + adapterInput + " V, Output " + adapterOutput + " V");
        return adapterOutput;
    }
}
