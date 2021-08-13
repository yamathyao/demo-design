package com.example.demo.design.proxy.image;

import com.example.demo.design.proxy.image.impl.ProxyImage;

/**
 * 代理模式
 *
 * @author yao
 * @date 2019/12/8
 */
public class MainApplication {

    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");

        image.display();

        image.display();
    }
}
