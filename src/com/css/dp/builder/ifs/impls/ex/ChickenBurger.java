package com.css.dp.builder.ifs.impls.ex;

import com.css.dp.builder.ifs.impls.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
