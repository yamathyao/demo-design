package com.example.demo.design.composite.charactor;

import java.util.List;

/**
 * @author GEEX177
 * @date 2019/12/5
 */
public class ChineseSentence extends AbstractCharacter {

    public ChineseSentence(List<ChineseWord> words) {
        for (ChineseWord word : words) {
            add(word);
        }
    }

    @Override
    public void printAfter() {
        System.out.print("。");
    }
}
