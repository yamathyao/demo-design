package com.example.demo.design.dynamic.proxy;

import com.example.demo.design.dynamic.proxy.impl.JdkHouseProxy;
import com.example.demo.design.dynamic.proxy.impl.RentHouseImpl;
import com.example.demo.design.dynamic.proxy.impl.SellHouseImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yao
 * @date 2021/8/13
 */
public class JdkMainApplication {

    public static void main(String[] args) {
        IRentHouse rentHouse = new RentHouseImpl();
        // 定义一个 handle
        InvocationHandler handler = new JdkHouseProxy(rentHouse);
        // 获取类 classloader
        ClassLoader cl = rentHouse.getClass().getClassLoader();
        // 动态代理者
        IRentHouse rentProxy = (IRentHouse) Proxy.newProxyInstance(cl, new Class[]{IRentHouse.class}, handler);
        rentProxy.rentHouse();

        ISellHouse sellHouse = new SellHouseImpl();
        handler = new JdkHouseProxy(sellHouse);
        cl = sellHouse.getClass().getClassLoader();
        ISellHouse sellProxy = (ISellHouse) Proxy.newProxyInstance(cl, new Class[]{ISellHouse.class}, handler);
        sellProxy.sellHouse();
    }
}
