package com.example.demo.design.decorator.shape;

import com.example.demo.design.decorator.shape.impl.Circle;
import com.example.demo.design.decorator.shape.impl.Rectangle;

/**
 * @author yao
 * @date 2019/12/6
 */
public class MainApplication {

    public static void main(String[] args) {

        AbstractDecorator redCircle = new RedShapeDecorator(new Circle());
        AbstractDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        new Circle().draw();

        redCircle.draw();

        redRectangle.draw();
    }
}
