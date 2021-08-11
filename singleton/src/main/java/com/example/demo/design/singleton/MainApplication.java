package com.example.demo.design.singleton;

import com.example.demo.design.singleton.lazy.DclSingleton;
import com.example.demo.design.singleton.enums.EnumSingleton;
import com.example.demo.design.singleton.holder.HolderSingleton;
import com.example.demo.design.singleton.hungry.HungrySingleton;
import com.example.demo.design.singleton.lazy.NoSafeSingleton;
import com.example.demo.design.singleton.lazy.SafeSingleton;

/**
 * 单例模式
 *
 * @author yao
 * @date 2019/12/8
 */
public class MainApplication {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
        // 枚举式
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        // 静态内部类方式
        HolderSingleton holderSingleton = HolderSingleton.getInstance();
        // 饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        // 懒汉式，不推荐
        NoSafeSingleton noSafeSingleton = NoSafeSingleton.getInstance();
        SafeSingleton safeSingleton = SafeSingleton.getInstance();
        // 双重检查锁，不推荐
        DclSingleton dclSingleton = DclSingleton.getInstance();
    }
}
