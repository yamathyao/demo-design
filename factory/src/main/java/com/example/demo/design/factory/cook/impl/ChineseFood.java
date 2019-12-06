package com.example.demo.design.factory.cook.impl;

import com.example.demo.design.factory.cook.Food;
import com.example.demo.design.factory.cook.FoodType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class ChineseFood implements Food {

    private FoodType foodType;

    public ChineseFood(FoodType foodType) {
        log.info(foodType.getName() + " Chinese food.");
        this.foodType = foodType;
    }

    @Override
    public FoodType getFood(FoodType foodType) {
        return foodType;
    }
}
