package com.example.demo.design.singleton.enums;

/**
 * 枚举式
 * 实现简单，调用效率高，枚举本身就是单例，避免通过反射和反序列化的漏洞
 * 缺点是没有延迟加载
 *
 * @author yao
 * @date 2019/12/8
 */
public enum EnumSingleton {
    /**
     *
     */
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
