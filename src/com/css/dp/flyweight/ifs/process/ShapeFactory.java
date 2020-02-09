package com.css.dp.flyweight.ifs.process;

import com.css.dp.flyweight.ifs.Shape;
import com.css.dp.flyweight.ifs.impl.Circle;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle (String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
