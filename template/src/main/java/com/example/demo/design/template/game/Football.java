package com.example.demo.design.template.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class Football extends AbstractGame {
    @Override
    void init() {
        log.info("Football game init, ready to start...");
    }

    @Override
    void startPlay() {
        log.info("Football game started, enjoy the game...");
    }

    @Override
    void endPlay() {
        log.info("Football game finished...");
    }
}
