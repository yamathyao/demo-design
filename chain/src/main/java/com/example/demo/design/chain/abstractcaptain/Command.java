package com.example.demo.design.chain.abstractcaptain;

import lombok.Getter;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Command {

    @Getter
    private final String message;

    @Getter
    private final ArmyLevel level;

    protected Command(ArmyLevel level, String message) {
        this.level = level;
        this.message = message;
    }

    @Override
    public String toString() {
        return getMessage();
    }

    public enum ArmyLevel {
        // 元帅
        MARSHAL,
        // 将军
        GENERAL,
        // 上校
        COLONEL,
        // 军队
        ARMY
    }
}
