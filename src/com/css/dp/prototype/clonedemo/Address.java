package com.css.dp.prototype.clonedemo;

public class Address implements Cloneable {

    private String type;
    private String value;

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
