package com.example.demo.design.observer.subject;

/**
 * @author yao
 * @date 2019/12/7
 */
public abstract class AbstractObserver {

    protected Subject subject;

    public abstract void update();
}
