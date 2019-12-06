package com.example.demo.design.flyweight.weapon;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class HandGun implements Shoot {
    @Override
    public void shoot() {
        log.info("Handgun shooting... | hash: {}", System.identityHashCode(this));
    }
}
