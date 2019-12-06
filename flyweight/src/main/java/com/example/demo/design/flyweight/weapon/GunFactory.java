package com.example.demo.design.flyweight.weapon;

import lombok.extern.slf4j.Slf4j;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class GunFactory {

    private static final Map<GunType, Shoot> GUN_MAP = new EnumMap<>(GunType.class);

    public Shoot createGun(GunType type) {
        Shoot gun = GUN_MAP.get(type);
        if (null == gun) {
            switch (type) {
                case HANDGUN:
                    log.info("A new handgun...");
                    gun = new HandGun();
                    GUN_MAP.put(type, gun);
                    break;
                case MACHINEGUN:
                    log.info("A new machine gun...");
                    gun = new MachineGun();
                    GUN_MAP.put(type, gun);
                    break;
                case MUSKET:
                    log.info("A new musket...");
                    gun = new Musket();
                    GUN_MAP.put(type, gun);
                    break;
                case SNIPER:
                    log.info("A new sniper...");
                    gun = new Sniper();
                    GUN_MAP.put(type, gun);
                    break;
                default:
                    break;
            }
        }
        return gun;
    }
}
