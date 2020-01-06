package com.css.dp.adapter.demo2.impls;

import com.css.dp.adapter.demo2.ifs.TFCard;

public class TFCardImpl implements TFCard {
    @Override
    public String readTFCard() {
        return "TFCard read ...";
    }

    @Override
    public int writeTFCard(String msg) {
        System.out.println("TFCard write: " + msg);
        return 0;
    }
}
