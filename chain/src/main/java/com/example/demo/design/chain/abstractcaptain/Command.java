package com.example.demo.design.chain.abstractcaptain;

import lombok.Getter;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class Army {

    @Getter
    private final String command;

    @Getter
    private final ArmyLevel level;

    protected Army(ArmyLevel level, String command) {
        this.level = level;
        this.command = command;
    }

    public enum ArmyLevel {
        // 元帅
        MARSHAL,
        // 将军
        GENERAL,
        // 上校
        COLONEL;
    }
}
