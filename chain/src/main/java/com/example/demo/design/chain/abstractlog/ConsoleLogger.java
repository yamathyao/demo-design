package com.example.demo.design.chain.abstractlog;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger() {
        this.level = INFO;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        log.info("Console log: " + message);
    }
}
