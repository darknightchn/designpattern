package com.css.dp.builder.cases2;

import com.css.dp.builder.productions.AlloyFrame;
import com.css.dp.builder.productions.Bike;
import com.css.dp.builder.productions.DermisSeat;
import com.css.dp.builder.productions.SolidTire;

public class MobikeBuilder extends Builder {

    private Bike mBike = new Bike();

    @Override
    void buildFrame() {
        mBike.setFrame(new AlloyFrame());
    }

    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }

    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
