package com.css.dp.demo1.v2;

public class Multiply extends Operation {
    @Override
    public double getResult() {
        double res = getNumA() * getNumB();
        return res;
    }
}
