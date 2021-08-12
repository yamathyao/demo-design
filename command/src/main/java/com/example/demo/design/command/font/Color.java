package com.example.demo.design.command.font;

/**
 * @author yao
 * @date 2019/12/5
 */
public enum Color {

    RED("red"), BLACK("black");

    private String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
