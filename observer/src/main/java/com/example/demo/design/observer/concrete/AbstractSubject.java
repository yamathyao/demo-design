package com.example.demo.design.observer.concrete;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2021/8/13
 */
public abstract class AbstractSubject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers(int state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    /**
     * 更新状态
     *
     * @param state
     */
    public abstract void updateState(int state);
}
