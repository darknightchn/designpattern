package com.css.dp.prototype.demo.templ.model;

import com.css.dp.prototype.demo.templ.Shape;

public class Circle extends Shape {
 
   public Circle(){
     type = "Circle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}