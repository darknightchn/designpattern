package com.css.dp.demo1.v2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double a, b;
        String operate;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入A:");
            a = scanner.nextDouble();
            System.out.println("请输入运算符(+ , - , * , /)");
            operate = scanner.next();
            System.out.println("请输入B:");
            b = scanner.nextDouble();
        }
        Operation o = OperationFactory.createOperation(operate);
        o.setNumA(a);
        o.setNumB(b);
        System.out.println("结果是: " + o.getResult());
    }

}
