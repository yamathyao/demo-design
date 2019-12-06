package com.example.demo.design.flyweight.weapon;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class Musket implements Shoot {
    @Override
    public void shoot() {
        log.info(" Musket is shooting... | hash: {}", System.identityHashCode(this));
    }
}
