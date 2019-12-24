package com.css.dp.abstractfactory.impls;

import com.css.dp.abstractfactory.interfaces.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
