package com.example.demo.design.memento.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");

        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        log.info("Current state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        log.info("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        log.info("Second saved state: " + originator.getState());
    }
}
