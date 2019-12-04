package com.example.demo.design.bridge;

import com.example.demo.design.bridge.inter.Enemy;
import lombok.Getter;
import lombok.Setter;

/**
 * @author GEEX177
 * @date 2019/12/4
 */
public abstract class AbstractWar {

    @Getter
    @Setter
    private Enemy enemy;

    public void startWar() {
        enemy.startWar();
    }

    public void combatting() {
        enemy.combatting();
    }

    public void stopWar() {
        enemy.stopWar();
    }

}
