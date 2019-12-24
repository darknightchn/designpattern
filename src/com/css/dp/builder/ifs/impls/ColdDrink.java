package com.css.dp.builder.ifs.impls;

import com.css.dp.builder.ifs.Item;
import com.css.dp.builder.ifs.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();

}
