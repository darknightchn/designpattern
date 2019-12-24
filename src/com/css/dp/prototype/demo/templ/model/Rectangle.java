package com.css.dp.prototype.demo.templ.model;

import com.css.dp.prototype.demo.templ.Shape;

public class Rectangle extends Shape {

    public Rectangle () {
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
