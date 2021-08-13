package com.example.demo.design.dynamic.proxy;

import com.example.demo.design.dynamic.proxy.impl.CglibHouseProxy;
import com.example.demo.design.dynamic.proxy.impl.RentHouseImpl;
import com.example.demo.design.dynamic.proxy.impl.SellHouseImpl;

/**
 * cglib 动态代理
 *
 * @author yao
 * @date 2021/8/13
 */
public class CglibMainApplication {

    public static void main(String[] args) {
        IRentHouse rentHouse = new RentHouseImpl();
        // cglib 代理
        CglibHouseProxy proxy = new CglibHouseProxy(rentHouse);
        RentHouseImpl rentProxy = (RentHouseImpl) proxy.getInstance();
        rentProxy.rentHouse();

        ISellHouse sellHouse = new SellHouseImpl();
        proxy = new CglibHouseProxy(sellHouse);
        SellHouseImpl sellProxy = (SellHouseImpl) proxy.getInstance();
        sellProxy.sellHouse();
    }
}
