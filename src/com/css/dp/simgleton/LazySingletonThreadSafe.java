package com.css.dp.simgleton;

/**
 * 懒汉式，线程安全
 */
public class LazySingletonThreadSafe {

    private static LazySingletonThreadSafe instance;

    private LazySingletonThreadSafe () {}

    public static synchronized LazySingletonThreadSafe getInstance () {
        if (instance == null) {
            instance = new LazySingletonThreadSafe();
        }
        return instance;
    }

}
