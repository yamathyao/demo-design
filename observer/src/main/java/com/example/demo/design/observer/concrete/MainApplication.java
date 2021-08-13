package com.example.demo.design.observer.concrete;

import com.example.demo.design.observer.concrete.impl.BinaryObserverImpl;
import com.example.demo.design.observer.concrete.impl.HexObserverImpl;
import com.example.demo.design.observer.concrete.impl.OctalObserverImpl;

/**
 * @author yao
 * @date 2021/8/13
 */
public class MainApplication {

    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();
        // 添加观察者
        subject.addObserver(new BinaryObserverImpl());
        subject.addObserver(new HexObserverImpl());
        subject.addObserver(new OctalObserverImpl());

        subject.updateState(10);

        subject.updateState(15);
    }
}
