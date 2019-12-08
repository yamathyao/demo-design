package com.example.demo.design.singleton.hungry;

/**
 * @author yao
 * @date 2019/12/8
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
