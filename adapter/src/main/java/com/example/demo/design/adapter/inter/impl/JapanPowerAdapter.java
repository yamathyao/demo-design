package com.example.demo.design.adapter.inter.impl;

import com.example.demo.design.adapter.inter.Ac;
import com.example.demo.design.adapter.inter.DC5Adapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/3
 */
@Slf4j
public class JapanPowerAdapter implements DC5Adapter {

    private static final int VOLTAGE = 110;

    @Override
    public boolean support(Ac ac) {
        return (VOLTAGE == ac.outputAc());
    }

    @Override
    public int outputDC5V(Ac ac) {
        int adapterInput = ac.outputAc();
        int adapterOutput = adapterInput / 22;
        log.info("Japan Power Adapter, Input " + adapterInput + " V, Output " + adapterOutput + " V");
        return adapterOutput;
    }
}
