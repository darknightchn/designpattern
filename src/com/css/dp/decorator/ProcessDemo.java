package com.css.dp.decorator;

import com.css.dp.decorator.decorator.RedShapeDecorator;
import com.css.dp.decorator.decorator.abs.ShapeDecoractor;
import com.css.dp.decorator.ifs.Shape;
import com.css.dp.decorator.ifs.impls.Circle;
import com.css.dp.decorator.ifs.impls.Rectangle;

public class ProcessDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecoractor redCircle = new RedShapeDecorator(new Circle());
        ShapeDecoractor redRectangle = new RedShapeDecorator(new Rectangle());
        // Shape redCircle = new RedShapeDecorator(new Circle());
        // Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
