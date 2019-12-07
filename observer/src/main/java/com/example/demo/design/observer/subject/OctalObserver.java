package com.example.demo.design.observer.subject;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class OctalObserver extends AbstractObserver {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("Octal string: {}", Integer.toOctalString(subject.getState()));
    }
}
