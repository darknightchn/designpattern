package com.css.dp.demo1.v2;

public class OperationFactory {

    public static Operation createOperation (String operate) {
        Operation o = null;
        switch (operate) {
            case "+":
                o = new Add();
                break;
            case "-":
                o = new Sub();
                break;
            case "*":
                o = new Multiply();
                break;
            case "/":
                o = new Devide();
                break;
        }
        return o;
    }

}
