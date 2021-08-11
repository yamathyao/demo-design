package com.example.demo.design.factory.cook.impl;

import com.example.demo.design.factory.cook.Cook;
import com.example.demo.design.factory.cook.Cooker;
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
    private Cooker cooker;

    public ChineseFood(Cooker cooker, FoodType foodType) {
        log.info(cooker.getName() + " cooked " + foodType.getName() + " Chinese food.");
        this.foodType = foodType;
        this.cooker = cooker;
    }
}
