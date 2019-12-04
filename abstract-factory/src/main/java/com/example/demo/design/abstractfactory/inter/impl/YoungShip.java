package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Ship;

/**
 * new ship
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public class YoungShip implements Ship {

    private static final String DESCRIPTION = "It is a new ship.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
