package com.example.demo.design.factory.cook;

/**
 * 食物类型枚举
 *
 * @author yao
 * @date 2019/12/6
 */

public enum FoodType {

    /**
     * 热菜
     */
    HOT("hot"),
    /**
     * 冷菜
     */
    COLD("cold");

    private final String name;

    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
