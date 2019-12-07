package com.example.demo.design.mediator.chat;

/**
 * @author yao
 * @date 2019/12/7
 */
public class MainApplication {

    public static void main(String[] args) {
        User robert = new User("Robert");

        User john = new User("John");

        robert.sendMessage("Hello, John");

        john.sendMessage("Hi, Robert");
    }
}
