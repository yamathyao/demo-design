package com.example.demo.design.facade.shape.impl;

import com.example.demo.design.facade.shape.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author GEEX177
 * @date 2019/12/6
 */
@Slf4j
public class Circle implements Shape {
    @Override
    public void draw() {
        log.info("draw circle");
    }
}
