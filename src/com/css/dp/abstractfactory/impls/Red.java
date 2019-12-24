package com.css.dp.abstractfactory.impls;

import com.css.dp.abstractfactory.interfaces.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
