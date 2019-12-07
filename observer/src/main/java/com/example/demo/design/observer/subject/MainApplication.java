package com.example.demo.design.observer.subject;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {

        Subject subject  = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        log.info("First state change: 15");
        subject.setState(15);
        log.info("Second state change: 10");
        subject.setState(10);
    }
}
