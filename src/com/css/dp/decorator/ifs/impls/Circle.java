package com.css.dp.decorator.ifs.impls;

import com.css.dp.decorator.ifs.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
