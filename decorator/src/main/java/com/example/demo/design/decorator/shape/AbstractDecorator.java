package com.example.demo.design.decorator.shape;

/**
 * @author yao
 * @date 2019/12/6
 */
public abstract class AbstractDecorator implements Shape {

    protected Shape decoratorShape;

    public AbstractDecorator(Shape shape) {
        this.decoratorShape = shape;
    }


    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
