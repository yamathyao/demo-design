package com.example.demo.design.composite.charactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yao on 2019/12/5.
 */
public class Write {

    public AbstractCharacter sentenceByChinese() {
        List<ChineseWord> words = new ArrayList<>();

        words.add(new ChineseWord(Arrays.asList(new Character('我'))));
        words.add(new ChineseWord(Arrays.asList(new Character('是'))));
        words.add(new ChineseWord(Arrays.asList(new Character('来'), new Character('自'))));
        words.add(new ChineseWord(Arrays.asList(new Character('北'), new Character('京'))));
        words.add(new ChineseWord(Arrays.asList(new Character('的'))));
        words.add(new ChineseWord(Arrays.asList(new Character('小'), new Character('明'))));

        return new ChineseSentence(words);
    }

    public AbstractCharacter sentenceByEnglish() {
        List<EnglishWord> words = new ArrayList<>();

        words.add(new EnglishWord(Arrays.asList(new Character('I'))));
        words.add(new EnglishWord(Arrays.asList(new Character('a'), new Character('m'))));
        words.add(new EnglishWord(Arrays.asList(new Character('a'))));
        words.add(new EnglishWord(Arrays.asList(new Character('s'), new Character('t'), new Character('u'), new Character('d'), new Character('e'), new Character('n'), new Character('t'))));
        words.add(new EnglishWord(Arrays.asList(new Character('f'), new Character('r'), new Character('o'), new Character('m'))));
        words.add(new EnglishWord(Arrays.asList(new Character('L'), new Character('o'), new Character('n'), new Character('d'), new Character('o'), new Character('n'))));
        return new EnglishSentence(words);
    }
}
