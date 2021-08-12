package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Sailor;

/**
 * young sailor
 *
 * @author yao
 * @date 2019/12/3
 */
public class YoungSailor implements Sailor {

    private static final String DESCRIPTION = "I am a young sailor.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
