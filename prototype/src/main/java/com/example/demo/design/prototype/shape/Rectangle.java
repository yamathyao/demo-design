package com.example.demo.design.prototype.shape;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class Rectangle extends AbstractShape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        log.info("Inside Rectangle:: draw() method.");
    }
}
