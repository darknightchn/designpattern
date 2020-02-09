package com.css.dp.flyweight.ifs.process;

import com.css.dp.flyweight.ifs.impl.Circle;

/**
 * 享元模式
 * 意图：运用共享技术有效地支持大量细粒度的对象。
 * 一个游戏中有不同的英雄角色，同一类型的角色也有不同属性的英雄，
 * 如刺客类型的英雄有很多个，按此种模式设计，利用英雄所属类型去引用原有同一类型的英雄实例，然后对其相应属性进行修改，便可得到最终想得到的最新英雄；
 * 比如说你创建了第一个刺客型英雄，然后需要设计第二个刺客型英雄，你利用第一个英雄改变属性得到第二个刺客英雄，
 * 最新的刺客英雄是诞生了，但第一个刺客英雄的属性也随之变得与第二个相同，这种情况显然是不可以的。
 */
public class ProcessDemo {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
