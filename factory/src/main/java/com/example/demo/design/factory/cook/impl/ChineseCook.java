package com.example.demo.design.factory.cook.impl;

import com.example.demo.design.factory.cook.Cook;
import com.example.demo.design.factory.cook.Food;
import com.example.demo.design.factory.cook.FoodType;

/**
 * @author yao
 * @date 2019/12/6
 */

public class ChineseCook implements Cook {
    @Override
    public Food cook(FoodType foodType) {
        return new ChineseFood(foodType);
    }
}
