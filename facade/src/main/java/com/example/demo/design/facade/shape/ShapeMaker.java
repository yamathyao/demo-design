package com.example.demo.design.facade.shape;

import com.example.demo.design.facade.shape.impl.Circle;
import com.example.demo.design.facade.shape.impl.Rectangle;
import com.example.demo.design.facade.shape.impl.Square;

/**
 * Created by yao on 2019/12/6.
 */
public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
