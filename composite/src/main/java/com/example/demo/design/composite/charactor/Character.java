package com.example.demo.design.composite.charactor;

/**
 * @author yao
 * @date 2019/12/5
 */
public class Character extends AbstractCharacter {

    private char c;

    public Character(char c) {
        this.c = c;
    }

    @Override
    public void print() {
        System.out.print(String.valueOf(c));
    }
}
