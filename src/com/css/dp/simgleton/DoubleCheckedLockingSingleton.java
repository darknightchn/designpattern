package com.css.dp.simgleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class DoubleCheckedLockingSingleton implements Serializable {

    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton () {
        System.out.println("init...");
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
    // 反序列化定义该方法，则不需要创建新对象
    private Object readResolve () throws ObjectStreamException {
        return instance;
    }

}
