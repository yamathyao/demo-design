package com.example.demo.design.factory.cook;

/**
 * @author yao
 * @date 2019/12/6
 */

public enum FoodType {

    HOT("hot"), COLD("cold");

    private String name;

    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    }
