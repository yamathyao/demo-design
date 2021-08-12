package com.example.demo.design.bridge;

import com.example.demo.design.bridge.inter.impl.PowerfulEnemy;
import com.example.demo.design.bridge.inter.impl.WeakEnemy;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/4
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        AbstractWar war = new AncientWar();
        war.setEnemy(new PowerfulEnemy());
        war.startWar();
        war.combatting();
        war.stopWar();

        war = new AncientWar();
        war.setEnemy(new WeakEnemy());
        war.startWar();
        war.stopWar();
    }
}
