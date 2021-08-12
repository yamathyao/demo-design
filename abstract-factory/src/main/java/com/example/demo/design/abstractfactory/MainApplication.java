package com.example.demo.design.abstractfactory;

import com.example.demo.design.abstractfactory.factory.impl.OldTeamFactory;
import com.example.demo.design.abstractfactory.factory.TeamFactory;
import com.example.demo.design.abstractfactory.factory.impl.YoungTeamFactory;
import com.example.demo.design.abstractfactory.inter.Captain;
import com.example.demo.design.abstractfactory.inter.Sailor;
import com.example.demo.design.abstractfactory.inter.Ship;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/3
 */
@Slf4j
public class MainApplication {

    @Getter
    @Setter
    private Captain captain;

    @Getter
    @Setter
    private Ship ship;

    @Getter
    @Setter
    private Sailor sailor;

    /**
     * create a team (young or old)
     *
     * @param factory
     */
    public void createTeam(final TeamFactory factory) {
        setCaptain(factory.createCaptain());
        setShip(factory.createShip());
        setSailor(factory.createSailor());
    }

    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        // create a young team
        app.createTeam(new YoungTeamFactory());
        log.info("It is creating a young team now...");
        log.info("-->" + app.getCaptain().getDescription());
        log.info("-->" + app.getShip().getDescription());
        log.info("-->" + app.getSailor().getDescription());
        // create an old team
        app.createTeam(new OldTeamFactory());
        log.info("It is creating an old team now...");
        log.info("-->" + app.getCaptain().getDescription());
        log.info("-->" + app.getShip().getDescription());
        log.info("-->" + app.getSailor().getDescription());
    }

}
