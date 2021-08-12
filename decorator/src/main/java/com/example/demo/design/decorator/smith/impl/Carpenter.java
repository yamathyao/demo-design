package com.example.demo.design.decorator.smith.impl;

import com.example.demo.design.decorator.smith.Operation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class Carpenter implements Operation {
    @Override
    public void checkBefore() {
        log.info("check wood");
    }

    @Override
    public void join() {
        log.info("join wood");
    }

    @Override
    public void checkAfter() {
        log.info("finish wood");
    }
}
