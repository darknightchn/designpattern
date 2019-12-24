package com.css.dp.abstractfactory.factorys;

import com.css.dp.abstractfactory.impls.Circle;
import com.css.dp.abstractfactory.impls.Rectangle;
import com.css.dp.abstractfactory.impls.Square;
import com.css.dp.abstractfactory.interfaces.Color;
import com.css.dp.abstractfactory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Shape getShape(String shapeName) {
        if(shapeName == null){
            return null;
        }
        if(shapeName.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeName.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }
}
