package com.css.dp.builder.cases2;

import com.css.dp.builder.productions.Bike;

public class ProcessDemo {

    public static void main(String[] args) {
        showBike(new OfoBuilder());
        System.out.println();
        showBike(new MobikeBuilder());
    }

    private static void showBike (Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }

}
