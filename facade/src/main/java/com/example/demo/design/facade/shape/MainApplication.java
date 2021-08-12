package com.example.demo.design.facade.shape;

/**
 * @author yao
 * @date 2019/12/6
 */
public class MainApplication {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
