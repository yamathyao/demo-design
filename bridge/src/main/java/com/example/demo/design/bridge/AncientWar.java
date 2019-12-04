package com.example.demo.design.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author GEEX177
 * @date 2019/12/4
 */
@Slf4j
public class AncientWar extends AbstractWar {

    @Override
    public void startWar() {
        log.info("start an ancient war...");
        super.startWar();
    }

    @Override
    public void combatting() {
        log.info("an ancient war is combatting...");
        super.combatting();
    }

    @Override
    public void stopWar() {
        log.info("stop an ancient war...");
        super.stopWar();
    }
}
