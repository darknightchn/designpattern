package com.css.dp.builder.ifs.impls.ex;

import com.css.dp.builder.ifs.impls.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}
