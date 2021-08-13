package com.example.demo.design.dynamic.proxy.impl;

import com.example.demo.design.dynamic.proxy.IRentHouse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
public class RentHouseImpl implements IRentHouse {
    @Override
    public void rentHouse() {
        log.info("租了一间房");
    }
}
