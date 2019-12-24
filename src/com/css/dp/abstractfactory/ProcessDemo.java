package com.css.dp.abstractfactory;

import com.css.dp.abstractfactory.factorys.AbstractFactory;
import com.css.dp.abstractfactory.factorys.FactoryProducer;
import com.css.dp.abstractfactory.interfaces.Color;
import com.css.dp.abstractfactory.interfaces.Shape;

import java.util.Objects;

public class ProcessDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = Objects.requireNonNull(shapeFactory).getShape("circle");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }

}
