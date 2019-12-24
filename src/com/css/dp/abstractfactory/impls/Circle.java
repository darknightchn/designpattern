package com.css.dp.abstractfactory.impls;

import com.css.dp.abstractfactory.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
