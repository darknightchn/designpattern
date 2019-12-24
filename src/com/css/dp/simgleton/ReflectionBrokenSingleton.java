package com.css.dp.simgleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBrokenSingleton {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.css.dp.simgleton.DoubleCheckedLockingSingleton");
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        DoubleCheckedLockingSingleton dclSingleton1 = (DoubleCheckedLockingSingleton) c.newInstance(null);
        DoubleCheckedLockingSingleton dclSingleton2 = (DoubleCheckedLockingSingleton) c.newInstance(null);

        System.out.println(dclSingleton1);
        System.out.println(dclSingleton2);
    }

}
