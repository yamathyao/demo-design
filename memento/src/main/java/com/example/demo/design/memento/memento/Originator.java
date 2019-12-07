package com.example.demo.design.memento.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yao
 * @date 2019/12/7
 */
public class Originator {

    @Getter
    @Setter
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
