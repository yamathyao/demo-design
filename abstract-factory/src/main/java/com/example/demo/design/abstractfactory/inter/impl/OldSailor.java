package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Sailor;

/**
 * old sailor
 *
 * @author yao
 * @date 2019/12/3
 */
public class OldSailor implements Sailor {

    private static final String DESCRIPTION = "I am an old sailor.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
