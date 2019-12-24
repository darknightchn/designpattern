package com.css.dp.prototype.clonedemo;

public class Person implements Cloneable {

    private String name;
    private Integer age;
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 如果一个被复制的属性都是基本类型，那么只需要实现当前类的cloneable机制就可以了，此为浅拷贝。
     *
     * 如果被复制对象的属性包含其他实体类对象引用，那么这些实体类对象都需要实现cloneable接口并覆盖clone()方法。
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        // 这样还不够，Person的clone()需要显式地clone其引用成员。
        Address a = ((Person) obj).getAddress();
        ((Person) obj).setAddress((Address) a.clone());
        return obj;
    }
}
