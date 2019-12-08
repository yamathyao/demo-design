package com.example.demo.design.template.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class Cricket extends AbstractGame {
    @Override
    void init() {
        log.info("Cricket init, ready to start game...");
    }

    @Override
    void startPlay() {
        log.info("Cricket started, enjoy the game...");
    }

    @Override
    void endPlay() {
        log.info("Cricket finished...");
    }
}
