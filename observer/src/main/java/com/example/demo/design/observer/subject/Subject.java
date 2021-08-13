package com.example.demo.design.observer.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 *
 * @author yao
 * @date 2019/12/7
 */
public class Subject {

    private List<AbstractObserver> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * 通知观察者们
     */
    public void notifyAllObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }

}
