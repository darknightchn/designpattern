package com.css.dp.demo1.v2;

public class Sub extends Operation {

    @Override
    public double getResult() {
        double res = getNumA() - getNumB();
        return res;
    }
}
