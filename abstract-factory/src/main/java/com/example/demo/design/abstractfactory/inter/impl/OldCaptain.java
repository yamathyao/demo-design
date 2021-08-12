package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Captain;

/**
 * old captain
 *
 * @author yao
 * @date 2019/12/3
 */
public class OldCaptain implements Captain {

    private static final String DESCRIPTION = "I am an old captain.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
