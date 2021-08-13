package com.example.demo.design.dynamic.proxy.impl;

import com.example.demo.design.dynamic.proxy.ISellHouse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
public class SellHouseImpl implements ISellHouse {
    @Override
    public void sellHouse() {
        log.info("卖了一间房");
    }
}
