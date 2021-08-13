package com.example.demo.design.observer.concrete;

/**
 * @author yao
 * @date 2021/8/13
 */
public class ConcreteSubject extends AbstractSubject {

    @Override
    public void updateState(int state) {
        notifyObservers(state);
    }
}
