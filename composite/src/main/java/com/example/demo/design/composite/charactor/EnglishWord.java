package com.example.demo.design.composite.charactor;

import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public class EnglishWord extends AbstractCharacter {

    public EnglishWord(List<Character> characters) {
        for (Character character : characters) {
            add(character);
        }
    }

    @Override
    public void printBefore() {
        System.out.print(" ");
    }
}
