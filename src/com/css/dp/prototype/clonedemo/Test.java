package com.css.dp.prototype.clonedemo;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setType("Home");
        address.setValue("BeiJing");

        Person p1 = new Person();
        p1.setName("p1");
        p1.setAge(10);
        p1.setAddress(address);

        Person p2 = (Person) p1.clone();
        System.out.println(p1 == p2);
        /**
         * 浅拷贝：被复制对象的所有值属性都含有与原来对象的相同，而所有的对象引用属性仍然指向原来的对象。
         * 深拷贝：在浅拷贝的基础上，所有引用其他对象的变量也进行了clone，并指向被复制过的新对象。
         *
         * 也就是说，一个默认的clone()方法实现机制，仍然是赋值。
         * 如果一个被复制的属性都是基本类型，那么只需要实现当前类的cloneable机制就可以了，此为浅拷贝。
         *
         * 如果被复制对象的属性包含其他实体类对象引用，那么这些实体类对象都需要实现cloneable接口并覆盖clone()方法。
         */
        p2.setName("p2");
        p2.getAddress().setType("Office");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }

}
