package com.example.demo.design.factory.shape;

import com.example.demo.design.factory.shape.impl.Circle;
import com.example.demo.design.factory.shape.impl.Rectangle;
import com.example.demo.design.factory.shape.impl.Square;
import org.springframework.util.StringUtils;

/**
 * @author yao
 * @date 2019/12/6
 */

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (StringUtils.isEmpty(shapeType)) {
            return null;
        }
        switch (shapeType) {
            case ("CIRCLE"):
                return new Circle();
            case ("SQUARE"):
                return new Square();
            case ("RECTANGLE"):
                return new Rectangle();
            default:
                return null;
        }
    }
}
