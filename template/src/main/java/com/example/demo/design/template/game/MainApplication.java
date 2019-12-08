package com.example.demo.design.template.game;

/**
 * @author yao
 * @date 2019/12/8
 */
public class MainApplication {

    public static void main(String[] args) {
        AbstractGame game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
