package com.example.demo.design.singleton.lazy;

import lombok.extern.slf4j.Slf4j;

/**
 * double-checked locking
 * 双重检索锁方式，（因为 JVM 重排序的原因，可能会初始化多次，不推荐）
 *
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class DclSingleton {

    private volatile static DclSingleton instance;

    private DclSingleton() {
        log.info("double-checked locking, not supported.");
    }

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
