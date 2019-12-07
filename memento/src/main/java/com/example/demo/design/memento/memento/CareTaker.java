package com.example.demo.design.memento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yao
 * @date 2019/12/7
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
