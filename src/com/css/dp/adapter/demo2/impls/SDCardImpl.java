package com.css.dp.adapter.demo2.impls;

import com.css.dp.adapter.demo2.ifs.SDCard;

public class SDCardImpl implements SDCard {
    @Override
    public String readSDCard() {
        return "SDCard read...";
    }

    @Override
    public int writeSDCard(String msg) {
        System.out.println("SDCard write: " + msg);
        return 0;
    }
}
