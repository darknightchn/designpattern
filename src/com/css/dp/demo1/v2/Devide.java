package com.css.dp.demo1.v2;

public class Devide extends Operation {

    @Override
    public double getResult() {
        double b = getNumB();
        if (b == 0) {
            return 0d;
        }
        double res = getNumA() / b;
        return res;
    }
}
