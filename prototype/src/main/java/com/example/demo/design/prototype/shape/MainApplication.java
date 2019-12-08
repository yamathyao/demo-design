package com.example.demo.design.prototype.shape;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/7
 */
@Slf4j
public class MainApplication {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        AbstractShape circle = ShapeCache.getShape("1");
        log.info("Shape: {}", circle.getType());

        AbstractShape rectangle = ShapeCache.getShape("3");
        log.info("Shape: {}", rectangle.getType());

        AbstractShape square = ShapeCache.getShape("2");
        log.info("Shape: {}", square.getType());
    }
}
