package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Captain;

/**
 * young captain
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public class YoungCaptain implements Captain {

    private static final String DESCRIPTION = "I am a young captain.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
