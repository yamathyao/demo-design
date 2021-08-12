package com.example.demo.design.composite.charactor;

/**
 * @author yao
 * @date 2019/12/5
 */
public class MainApplication {

    public static void main(String[] args) {
        AbstractCharacter chineseComposite = new Write().sentenceByChinese();
        chineseComposite.print();

        AbstractCharacter englishComposite = new Write().sentenceByEnglish();
        englishComposite.print();
    }
}
