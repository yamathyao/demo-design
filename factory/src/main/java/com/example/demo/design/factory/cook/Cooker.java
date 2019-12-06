package com.example.demo.design.factory.cook;

/**
 * @author yao
 * @date 2019/12/6
 */

public enum Cooker {

    CHINESE_COOKER("chinese cooker"), WESTERN_COOKER("western cooker");

    private String name;

    Cooker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
