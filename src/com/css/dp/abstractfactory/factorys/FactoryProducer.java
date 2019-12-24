package com.css.dp.abstractfactory.factorys;

public class FactoryProducer {

    public static AbstractFactory getFactory (String choice) {
        if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }

}
