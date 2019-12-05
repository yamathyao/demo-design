package com.example.demo.design.chain.abstractlog;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
@Slf4j
public class FileLogger extends AbstractLogger {

    public FileLogger() {
        this.level = DEBUG;
        setNextLogger(new ConsoleLogger());
    }

    @Override
    protected void write(String message) {
        log.info("File log: " + message);
    }
}
