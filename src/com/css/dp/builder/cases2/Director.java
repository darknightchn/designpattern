package com.css.dp.builder.cases2;

import com.css.dp.builder.productions.Bike;

public class Director {

    private Builder builder = null;

    public Director (Builder builder) {
        this.builder = builder;
    }

    public Bike construct () {
        builder.buildFrame();
        builder.buildSeat();
        builder.buildTire();
        return builder.createBike();
    }

}
