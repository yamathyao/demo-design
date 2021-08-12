package com.example.demo.design.composite.charactor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public abstract class AbstractCharacter {

    private List<AbstractCharacter> children = new ArrayList<>();

    public void add(AbstractCharacter character) {
        children.add(character);
    }

    public void printBefore() {
    }

    public void printAfter() {
    }

    public void print() {
        printBefore();
        for (AbstractCharacter character : children) {
            character.print();
        }
        printAfter();
    }
}
