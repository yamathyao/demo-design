package com.example.demo.design.singleton.lazy;

/**
 * lazy loading, not thread safe
 *
 * @author yao
 * @date 2019/12/8
 */
public class NoSafeSingleton {

    private static NoSafeSingleton instance;

    private NoSafeSingleton() {}

    public static NoSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NoSafeSingleton();
        }
        return instance;
    }
}
