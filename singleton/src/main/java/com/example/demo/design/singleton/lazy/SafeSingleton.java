package com.example.demo.design.singleton.lazy;

/**
 * lazy loading, safe
 * 懒汉式
 * 加载时加同步锁，保证线程安全
 *
 * @author yao
 * @date 2019/12/8
 */
public class SafeSingleton {

    private static SafeSingleton instance;

    private SafeSingleton() {
    }

    public static synchronized SafeSingleton getInstance() {
        if (instance == null) {
            instance = new SafeSingleton();
        }
        return instance;
    }
}
