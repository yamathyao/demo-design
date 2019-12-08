package com.example.demo.design.prototype.shape;

import java.util.Hashtable;

/**
 * @author yao
 * @date 2019/12/7
 */
public class ShapeCache {

    private static Hashtable<String, AbstractShape> shapeMap = new Hashtable<>();

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedShape = shapeMap.get(shapeId);
        return (AbstractShape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
