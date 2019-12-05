package com.example.demo.design.command.font;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public enum Size {

    LARGE("large"), SMALL("small");

    private String name;

    Size(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
