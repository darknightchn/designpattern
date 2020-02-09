package com.css.dp.decorator.ifs.impls;

import com.css.dp.decorator.ifs.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
