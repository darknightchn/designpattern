package com.css.dp.brige.abs.impls;

import com.css.dp.brige.abs.Shape;
import com.css.dp.brige.ifs.DrawAPI;

public class Circle extends Shape {

    private int radius, x, y;

    public Circle(int radius, int x, int y, DrawAPI api) {
        super(api);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        api.drawCircle(radius, x, y);
    }
}
