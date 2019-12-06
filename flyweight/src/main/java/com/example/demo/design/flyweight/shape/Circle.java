package com.example.demo.design.flyweight.shape;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class Circle implements Shape {

    public Circle(String color) {
        this.color = color;
    }

    private String color;

    @Setter
    private int x;

    @Setter
    private int y;

    @Setter
    private int radius;

    @Override
    public void draw() {
        log.info("draw circle [ color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + " ]");
    }
}
