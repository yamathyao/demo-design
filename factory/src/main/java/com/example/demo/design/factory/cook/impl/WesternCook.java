package com.example.demo.design.factory.cook.impl;

import com.example.demo.design.factory.cook.Cook;
import com.example.demo.design.factory.cook.Cooker;
import com.example.demo.design.factory.cook.Food;
import com.example.demo.design.factory.cook.FoodType;

/**
 * @author yao
 * @date 2019/12/6
 */

public class WesternCook implements Cook {

    @Override
    public Food cook(Cooker cooker, FoodType foodType) {
        return new WesternFood(cooker, foodType);
    }
}
