package com.example.demo.design.composite.charactor;

import java.util.List;

/**
 * @author yao
 * @date 2019/12/5
 */
public class EnglishSentence extends AbstractCharacter {

    public EnglishSentence(List<EnglishWord> words) {
        for (EnglishWord word : words) {
            add(word);
        }
    }

    @Override
    public void printAfter() {
        System.out.print(".");
    }
}
