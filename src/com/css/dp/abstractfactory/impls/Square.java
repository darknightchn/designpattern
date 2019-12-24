package com.css.dp.abstractfactory.impls;

import com.css.dp.abstractfactory.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
