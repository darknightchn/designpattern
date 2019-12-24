package com.css.dp.simgleton;

import java.io.*;

public class SerializeBrokenSingleton {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleCheckedLockingSingleton dcl1 = DoubleCheckedLockingSingleton.getInstance(),
                dcl2 = DoubleCheckedLockingSingleton.getInstance();
        FileOutputStream fos = new FileOutputStream("D:/text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dcl1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/text.txt"));
        DoubleCheckedLockingSingleton dcl3 = (DoubleCheckedLockingSingleton) ois.readObject();
        System.out.println(dcl1);
        System.out.println(dcl2);
        System.out.println(dcl3);

    }

}
