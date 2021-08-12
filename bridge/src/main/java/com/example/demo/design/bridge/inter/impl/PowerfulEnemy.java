package com.example.demo.design.bridge.inter.impl;

import com.example.demo.design.bridge.inter.Enemy;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author yao
 * @date 2019/12/4
 */
@Slf4j
public class PowerfulEnemy implements Enemy {
    @Override
    public void startWar() {
        log.info("enemy is powerful, ready to start...");
    }

    @Override
    public void combatting() {
        log.info("combatting with powerful enemy...");
    }

    @Override
    public void stopWar() {
        log.info("world in peace...");
    }
}
