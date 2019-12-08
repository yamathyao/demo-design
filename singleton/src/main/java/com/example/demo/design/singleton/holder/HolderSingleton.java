package com.example.demo.design.singleton.holder;

/**
 * singleton holder
 * @author yao
 * @date 2019/12/8
 */
public class HolderSingleton {

    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    private HolderSingleton() {}

    public static final HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
