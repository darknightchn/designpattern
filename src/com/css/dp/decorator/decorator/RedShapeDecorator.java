package com.css.dp.decorator.decorator;

import com.css.dp.decorator.decorator.abs.ShapeDecoractor;
import com.css.dp.decorator.ifs.Shape;

public class RedShapeDecorator extends ShapeDecoractor {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder (Shape decoratedShape) {
        System.out.println("Border Color: red");
    }
}
