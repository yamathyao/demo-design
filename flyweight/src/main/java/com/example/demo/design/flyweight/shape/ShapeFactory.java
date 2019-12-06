package com.example.demo.design.flyweight.shape;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class ShapeFactory {

    private static final HashMap<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) CIRCLE_MAP.get(color);
        if (circle == null) {
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
            log.info("Creating circle of color " + color);
        }
        return circle;
    }
}
