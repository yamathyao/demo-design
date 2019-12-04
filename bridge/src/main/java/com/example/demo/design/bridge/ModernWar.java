package com.example.demo.design.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX177
 * @date 2019/12/4
 */
@Slf4j
public class ModernWar extends AbstractWar {

    @Override
    public void startWar() {
        log.info("start a modern war...");
        super.startWar();
    }

    @Override
    public void combatting() {
        log.info("a modern war is combatting...");
        super.combatting();
    }

    @Override
    public void stopWar() {
        log.info("stop a modern war...");
        super.stopWar();
    }
}
