package com.example.demo.design.flyweight.shape;

import java.util.Random;

/**
 * @author yao
 * @date 2019/12/6
 */

public class MainApplication {

    private static final String colors[] = {"RED", "YELLOW", "GREEN", "BLUE", "WHILE"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomNumber());
            circle.setY(getRandomNumber());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
