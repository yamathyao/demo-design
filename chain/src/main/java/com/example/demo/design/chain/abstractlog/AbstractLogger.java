package com.example.demo.design.chain.abstractlog;

import lombok.Setter;

/**
 * @author yao
 * @date 2019/12/5
 */
public abstract class AbstractLogger {

    public static int INFO = 1;

    public static int DEBUG = 2;

    public static int ERROR = 3;

    protected int level;

    @Setter
    protected AbstractLogger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
