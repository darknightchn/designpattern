package com.css.dp.abstractfactory.factorys;

import com.css.dp.abstractfactory.impls.Blue;
import com.css.dp.abstractfactory.impls.Green;
import com.css.dp.abstractfactory.impls.Red;
import com.css.dp.abstractfactory.interfaces.Color;
import com.css.dp.abstractfactory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeName) {
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        if(colorName == null){
            return null;
        }
        if(colorName.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorName.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(colorName.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
