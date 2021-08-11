package com.example.demo.design.singleton.lazy;

/**
 * lazy loading, not thread safe
 * 懒汉式
 * 类初始化时，不会加载对象，使用时才会创建对象，具备懒加载功能，线程不安全
 *
 * @author yao
 * @date 2019/12/8
 */
public class NoSafeSingleton {

    private static NoSafeSingleton instance;

    private NoSafeSingleton() {
    }

    public static NoSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NoSafeSingleton();
        }
        return instance;
    }
}
