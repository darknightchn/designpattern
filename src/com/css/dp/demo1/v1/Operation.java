package com.css.dp.demo1.v1;

public class Operation {

    public double getResult (double numA, double numB, String operate) {
        double res = 0d;
        switch (operate) {
            case "+" :
                res = numA + numB;
                break;
            case "-" :
                res = numA - numB;
                break;
            case "*" :
                res = numA * numB;
                break;
            case "/" :
                if (numB == 0) {
                    res = 0d;
                }
                res = numA / numB;
                break;
            default:
        }
        return res;
    }

}
