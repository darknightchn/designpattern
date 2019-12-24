package com.css.dp.abstractfactory.factorys;

import com.css.dp.abstractfactory.interfaces.Color;
import com.css.dp.abstractfactory.interfaces.Shape;

/**
 * 抽象工厂模式
 *
 * 主要解决：主要解决接口选择的问题。
 *
 * 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 *
 * 如何解决：在一个工厂里聚合多个同类产品。
 *
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 *
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 */
public abstract class AbstractFactory {

    public abstract Shape getShape (String shapeName);

    public abstract Color getColor (String colorName);

}
