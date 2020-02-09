package com.css.dp.brige.ifs.impls;

import com.css.dp.brige.ifs.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Red Circle [ color: green; radius : " + radius + "; x: " + x + "; y: " + y + " ]");
    }
}
