package com.example.demo.design.factory.cook;

/**
 * @author yao
 * @date 2019/12/6
 */

public enum Cooker {

    /**
     * 中国厨师
     */
    CHINESE_COOKER("chinese cooker"),
    /**
     * 西餐厨师
     */
    WESTERN_COOKER("western cooker");

    private final String name;

    Cooker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
