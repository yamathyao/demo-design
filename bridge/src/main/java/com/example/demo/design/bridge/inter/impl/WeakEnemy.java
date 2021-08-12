package com.example.demo.design.bridge.inter.impl;

import com.example.demo.design.bridge.inter.Enemy;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author yao
 * @date 2019/12/4
 */
@Slf4j
public class WeakEnemy implements Enemy {
    @Override
    public void startWar() {
        log.info("enemy is weak, ready to start...");
    }

    @Override
    public void combatting() {
        log.info("enemy is weak, will be defeated...");
    }

    @Override
    public void stopWar() {
        log.info("enemy is defeated...");
    }
}
