package com.css.dp.demo1.v2;

public class Add extends Operation {

    @Override
    public double getResult() {
        double res = getNumA() + getNumB();
        return res;
    }
}
