package com.example.demo.design.singleton.hungry;

/**
 * 饿汉式
 * 类加载的时候初始化，线程安全，调用效率高
 *
 * @author yao
 * @date 2019/12/8
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
