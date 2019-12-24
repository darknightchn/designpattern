package com.css.dp.simgleton;

public class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {};

    public static SingletonObject getInstance() {
        return instance;
    }

    public void printMsg () {
        System.out.println("Hello, World");
    }

}
