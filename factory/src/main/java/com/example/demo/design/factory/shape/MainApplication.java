package com.example.demo.design.factory.shape;

/**
 * @author yao
 * @date 2019/12/6
 */

public class MainApplication {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("CIRCLE").draw();

        factory.getShape("SQUARE").draw();

        factory.getShape("RECTANGLE").draw();
    }
}
