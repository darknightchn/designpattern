package com.css.dp.prototype.demo.templ.model;

import com.css.dp.prototype.demo.templ.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}