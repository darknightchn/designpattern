package com.css.dp.brige;

import com.css.dp.brige.abs.Shape;
import com.css.dp.brige.abs.impls.Circle;
import com.css.dp.brige.ifs.impls.GreenCircle;
import com.css.dp.brige.ifs.impls.RedCircle;

/**
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
 *
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 * 缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 * 使用场景：
 *  1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 *  通过桥接模式可以使它们在抽象层建立一个关联关系。
 *  2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 *  3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 *
 * 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。
 */
public class ProcessDemmo {

    public static void main(String[] args) {
        Shape rCircle = new Circle(100, 200, 300, new RedCircle());
        Shape gCircle = new Circle(100, 200, 300, new GreenCircle());

        rCircle.draw();
        gCircle.draw();
    }

}
