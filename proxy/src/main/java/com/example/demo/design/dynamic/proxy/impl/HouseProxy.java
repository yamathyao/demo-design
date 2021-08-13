package com.example.demo.design.dynamic.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yao
 * @date 2021/8/13
 */
public class HouseProxy implements InvocationHandler {

    private final Object object;

    public HouseProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(this.object, objects);
    }
}
