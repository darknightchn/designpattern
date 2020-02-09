package com.css.dp.decorator.decorator.abs;

import com.css.dp.decorator.ifs.Shape;

public class ShapeDecoractor implements Shape {

    protected Shape decoratorShape;

    public ShapeDecoractor (Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        this.decoratorShape.draw();
    }

}
