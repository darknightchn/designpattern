package com.css.dp.adapter.demo2.impls;

import com.css.dp.adapter.demo2.ifs.SDCard;
import com.css.dp.adapter.demo2.ifs.TFCard;

public class SDCardAdapterTFCard implements SDCard {

    private TFCard tfCard;

    public SDCardAdapterTFCard (TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSDCard() {
        System.out.println("adapter read...");
        return tfCard.readTFCard();
    }

    @Override
    public int writeSDCard(String msg) {
        System.out.println("adapter write...");
        return tfCard.writeTFCard(msg);
    }
}
