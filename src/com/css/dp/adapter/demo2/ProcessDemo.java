package com.css.dp.adapter.demo2;

import com.css.dp.adapter.demo2.ifs.Computer;
import com.css.dp.adapter.demo2.ifs.SDCard;
import com.css.dp.adapter.demo2.ifs.TFCard;
import com.css.dp.adapter.demo2.impls.SDCardAdapterTFCard;
import com.css.dp.adapter.demo2.impls.SDCardImpl;
import com.css.dp.adapter.demo2.impls.TFCardImpl;
import com.css.dp.adapter.demo2.impls.ThinkPad;

public class ProcessDemo {

    private void readSDCard () {
        Computer computer = new ThinkPad();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSDCard(sdCard));
    }

    private void readTFCard() {
        Computer computer = new ThinkPad();
        TFCard tfCard = new TFCardImpl();
        SDCard adapter = new SDCardAdapterTFCard(tfCard);
        System.out.println(adapter.readSDCard());
    }

    public static void main(String[] args) {
        ProcessDemo demo = new ProcessDemo();
        demo.readSDCard();
        System.out.println("=========================================");
        demo.readTFCard();
    }

}
