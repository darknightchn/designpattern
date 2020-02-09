package com.css.dp.brige.abs;

import com.css.dp.brige.ifs.DrawAPI;

public abstract class Shape {

    protected DrawAPI api;

    protected Shape (DrawAPI api) {
        this.api = api;
    }

    public abstract void draw();

}
