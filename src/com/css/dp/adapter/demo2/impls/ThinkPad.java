package com.css.dp.adapter.demo2.impls;

import com.css.dp.adapter.demo2.ifs.Computer;
import com.css.dp.adapter.demo2.ifs.SDCard;

public class ThinkPad implements Computer {

    @Override
    public String readSDCard(SDCard sdCard) {
        if (sdCard == null)
            throw new NullPointerException();
        return sdCard.readSDCard();
    }
}
