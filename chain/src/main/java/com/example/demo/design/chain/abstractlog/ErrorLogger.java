package com.example.demo.design.chain.abstractlog;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = ERROR;
        setNextLogger(new FileLogger());
    }

    @Override
    protected void write(String message) {
        log.info("Error log: " + message);
    }
}
