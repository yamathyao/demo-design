package com.example.demo.design.factory.cook;

/**
 * @author yao
 * @date 2019/12/6
 */

public interface Cook {

    /**
     * cook
     *
     * @param foodType
     * @param cooker
     * @return
     */
    Food cook(Cooker cooker, FoodType foodType);
}
