package com.example.demo.design.observer.concrete.impl;

import com.example.demo.design.observer.concrete.Observer;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2021/8/13
 */
@Slf4j
public class OctalObserverImpl implements Observer {
    @Override
    public void update(int state) {
        log.info("Octal string: {}", Integer.toOctalString(state));
    }
}
