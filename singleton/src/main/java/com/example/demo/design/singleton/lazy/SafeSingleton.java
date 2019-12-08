package com.example.demo.design.singleton.lazy;

/**
 * lazy loading, safe
 *
 * @author yao
 * @date 2019/12/8
 */
public class SafeSingleton {

    private static SafeSingleton instance;

    private SafeSingleton() {}

    public static synchronized SafeSingleton getInstance() {
        if (instance == null) {
            instance = new SafeSingleton();
        }
        return instance;
    }
}
