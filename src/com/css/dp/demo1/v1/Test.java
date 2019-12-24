package com.css.dp.demo1.v1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入A:");
        double a = scanner.nextDouble();
        System.out.println("请输入运算符(+ , - , * , /)");
        String operate = scanner.next();
        System.out.println("请输入B:");
        double b = scanner.nextDouble();
        Operation oper = new Operation();
        System.out.println(oper.getResult(a, b, operate));

    }

}
