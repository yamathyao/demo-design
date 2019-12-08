package com.example.demo.design.singleton.dcl;

/**
 * double-checked locking
 *
 * @author yao
 * @date 2019/12/8
 */
public class DclSingleton {

    private volatile static DclSingleton instance;

    private DclSingleton() {}

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
