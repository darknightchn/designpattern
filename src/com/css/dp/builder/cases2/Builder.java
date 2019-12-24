package com.css.dp.builder.cases2;

import com.css.dp.builder.productions.Bike;

public abstract class Builder {

    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();

}
