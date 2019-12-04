package com.example.demo.design.abstractfactory.factory;

import com.example.demo.design.abstractfactory.inter.Captain;
import com.example.demo.design.abstractfactory.inter.Sailor;
import com.example.demo.design.abstractfactory.inter.Ship;

/**
 * team factory
 *
 * @author GEEX177
 * @date 2019/12/3
 */
public interface TeamFactory {

    /**
     * create a captain
     *
     * @return
     */
    Captain createCaptain();

    /**
     * create a ship
     *
     * @return
     */
    Ship createShip();

    /**
     * create a sailor
     *
     * @return
     */
    Sailor createSailor();
}
