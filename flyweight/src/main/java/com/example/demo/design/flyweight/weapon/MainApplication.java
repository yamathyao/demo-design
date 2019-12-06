package com.example.demo.design.flyweight.weapon;

/**
 * @author yao
 * @date 2019/12/6
 */

public class MainApplication {

    private static String[] guns = {"HANDGUN", "MUSKET", "SNIPER", "MACHINEGUN"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            String name = guns[(int) (Math.random() * guns.length)];
            GunFactory gunFactory = new GunFactory();
            Shoot gun = gunFactory.createGun(GunType.valueOf(name));
            gun.shoot();
        }
    }
}
