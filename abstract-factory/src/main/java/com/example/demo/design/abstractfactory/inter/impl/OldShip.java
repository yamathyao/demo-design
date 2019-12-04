package com.example.demo.design.abstractfactory.inter.impl;

import com.example.demo.design.abstractfactory.inter.Ship;

/**
 * old ship
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public class OldShip implements Ship {

    private static final String DESCRIPTION = "It is an old ship.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
