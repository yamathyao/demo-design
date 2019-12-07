package com.example.demo.design.mediator.chat;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yao
 * @date 2019/12/7
 */
public class User {

    @Getter
    @Setter
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
