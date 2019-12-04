package com.example.demo.design.abstractfactory.factory.impl;

import com.example.demo.design.abstractfactory.factory.TeamFactory;
import com.example.demo.design.abstractfactory.inter.Captain;
import com.example.demo.design.abstractfactory.inter.Sailor;
import com.example.demo.design.abstractfactory.inter.Ship;
import com.example.demo.design.abstractfactory.inter.impl.OldCaptain;
import com.example.demo.design.abstractfactory.inter.impl.OldSailor;
import com.example.demo.design.abstractfactory.inter.impl.OldShip;

/**
 * old team factory
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public class OldTeamFactory implements TeamFactory {
    @Override
    public Captain createCaptain() {
        return new OldCaptain();
    }

    @Override
    public Ship createShip() {
        return new OldShip();
    }

    @Override
    public Sailor createSailor() {
        return new OldSailor();
    }
}
