package com.css.dp.builder.ifs.impls.ex;

import com.css.dp.builder.ifs.impls.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
