package com.css.dp.abstractfactory.impls;

import com.css.dp.abstractfactory.interfaces.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
