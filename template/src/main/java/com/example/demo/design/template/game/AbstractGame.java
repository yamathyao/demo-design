package com.example.demo.design.template.game;

/**
 * @author yao
 * @date 2019/12/8
 */
public abstract class AbstractGame {

    abstract void init();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        init();

        startPlay();

        endPlay();
    }
}
