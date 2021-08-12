package com.example.demo.design.builder;

/**
 * @author yao
 * @date 2019/12/4
 */
public enum SkinColor {

    YELLOW("Yellow"), BLACK("Black"), WHITE("White");

    private String color;

    SkinColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
