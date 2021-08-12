package com.example.demo.design.facade.shape.impl;

import com.example.demo.design.facade.shape.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("draw rectangle");
    }
}
