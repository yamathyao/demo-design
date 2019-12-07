package com.example.demo.design.memento.memento;

import lombok.Getter;

/**
 * @author yao
 * @date 2019/12/7
 */
public class Memento {

    @Getter
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
