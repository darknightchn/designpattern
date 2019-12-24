package com.css.dp.simgleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登记式单例模式是对一组单例模式进行的维护, 保证 Map 中的对象是同一份 Spring 中使用的就是类似的模式
 */
public class RegisterSingleton {
    /**
     * 登记式单例模式, 保证map中的对象是同一份
     */
    private static Map<String, Object> instances;

    static {
        instances = new ConcurrentHashMap<>();
        instances.put(RegisterSingleton.class.getName(), new RegisterSingleton());
    }

    private RegisterSingleton () {
        System.out.println("This constructor is called!");
    }

    public static Object getInstance (String name) {
        if (name == null) {
            name = RegisterSingleton.class.getName();
        }
        if (instances.get(name) == null) {
            try {
                instances.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instances.get(name);
    }

}
