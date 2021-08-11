package com.example.demo.design.singleton.holder;

/**
 * singleton holder
 * 静态内部类，结合类懒汉式和饿汉式各自的优点，真正需要对象的时候才会加载，加载类是线程安全的
 *
 * @author yao
 * @date 2019/12/8
 */
public class HolderSingleton {

    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    private HolderSingleton() {
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
