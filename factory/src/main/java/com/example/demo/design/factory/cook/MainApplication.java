package com.example.demo.design.factory.cook;

import com.example.demo.design.factory.cook.impl.ChineseCook;
import com.example.demo.design.factory.cook.impl.WesternCook;

/**
 * @author yao
 * @date 2019/12/6
 */

public class MainApplication {

    public static void main(String[] args) {
        Cook cook = new ChineseCook();
        cook.cook(Cooker.CHINESE_COOKER, FoodType.COLD);

        cook = new WesternCook();
        cook.cook(Cooker.CHINESE_COOKER, FoodType.COLD);
        cook.cook(Cooker.WESTERN_COOKER, FoodType.HOT);
    }
}
