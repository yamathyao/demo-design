package com.example.demo.design.decorator.shape;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/6
 */
@Slf4j
public class RedShapeDecorator extends AbstractDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedShapeDecorator(decoratorShape);
    }

    private void setRedShapeDecorator(Shape shape) {
        log.info("Border color: red");
    }
}
