package com.example.demo.design.builder;

/**
 * @author GEEX177
 * @date 2019/12/4
 */
public enum Nationality {

    CHINA("China"), RUSSIA("Russia"), USA("United States"), JAPAN("Japan"), UK("United Kingdom");

    private String name;

    Nationality(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
