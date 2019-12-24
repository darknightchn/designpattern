package com.css.dp.builder.ifs.impls.ex;

import com.css.dp.builder.ifs.impls.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
