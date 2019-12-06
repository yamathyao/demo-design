package com.example.demo.design.decorator.smith.impl;

import com.example.demo.design.decorator.smith.Operation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/6
 */
@Slf4j
public class Smith implements Operation {

    protected Operation carpenterOp;

    public Smith(Operation operation) {
        this.carpenterOp = operation;
    }

    @Override
    public void checkBefore() {
        carpenterOp.checkBefore();
        log.info("check iron");
    }

    @Override
    public void join() {
        carpenterOp.join();
        log.info("join iron");
    }

    @Override
    public void checkAfter() {
        carpenterOp.checkAfter();
        log.info("finish iron");
    }
}
