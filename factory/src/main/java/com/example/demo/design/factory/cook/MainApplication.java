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
        cook.cook(FoodType.COLD);

        cook = new WesternCook();
        cook.cook(FoodType.COLD);
        cook.cook(FoodType.HOT);
    }
}
