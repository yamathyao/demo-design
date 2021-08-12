package com.example.demo.design.composite.charactor;

import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public class ChineseWord extends AbstractCharacter {

    public ChineseWord(List<Character> characters) {
        for (Character c : characters) {
            add(c);
        }
    }

    @Override
    public void printBefore() {
        System.out.print("");
    }
}
