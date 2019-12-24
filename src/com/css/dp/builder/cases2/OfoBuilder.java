package com.css.dp.builder.cases2;

import com.css.dp.builder.productions.Bike;
import com.css.dp.builder.productions.CarbonFrame;
import com.css.dp.builder.productions.InflateTire;
import com.css.dp.builder.productions.RubberSeat;

public class OfoBuilder extends Builder {

    private Bike bike = new Bike();

    @Override
    void buildFrame() {
        bike.setFrame(new CarbonFrame());
    }

    @Override
    void buildSeat() {
        bike.setSeat(new RubberSeat());
    }

    @Override
    void buildTire() {
        bike.setTire(new InflateTire());
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
