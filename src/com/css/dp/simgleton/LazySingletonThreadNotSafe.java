package com.css.dp.simgleton;

/**
 * 懒汉式，线程不安全
 */
public class LazySingletonThreadNotSafe {

    private static LazySingletonThreadNotSafe instance;

    private LazySingletonThreadNotSafe() {}

    public static LazySingletonThreadNotSafe getInstance () {
        if (instance == null) {
            instance = new LazySingletonThreadNotSafe();
        }
        return instance;
    }

}
