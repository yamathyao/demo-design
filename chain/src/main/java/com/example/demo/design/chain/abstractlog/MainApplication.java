package com.example.demo.design.chain.abstractlog;

/**
 *
 * @author GEEX177
 * @date 2019/12/5
 */
public class MainApplication {

    public static void main(String[] args) {
        AbstractLogger logger = new ErrorLogger();

        logger.logMessage(3, "This is an error log");
        logger.logMessage(2, "This is a file log");
        logger.logMessage(1, "This is a console log");
    }
}
