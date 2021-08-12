package com.example.demo.design.abstractfactory.factory.impl;

import com.example.demo.design.abstractfactory.factory.TeamFactory;
import com.example.demo.design.abstractfactory.inter.Sailor;
import com.example.demo.design.abstractfactory.inter.Ship;
import com.example.demo.design.abstractfactory.inter.impl.YoungShip;
import com.example.demo.design.abstractfactory.inter.Captain;
import com.example.demo.design.abstractfactory.inter.impl.YoungCaptain;
import com.example.demo.design.abstractfactory.inter.impl.YoungSailor;

/**
 * young captain factory
 *
 * @author yao
 * @date 2019/12/3
 */
public class YoungTeamFactory implements TeamFactory {

    @Override
    public Captain createCaptain() {
        return new YoungCaptain();
    }

    @Override
    public Ship createShip() {
        return new YoungShip();
    }

    @Override
    public Sailor createSailor() {
        return new YoungSailor();
    }
}
