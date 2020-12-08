package objectoriented._05polymorphism._03abstract.test;

import objectoriented._05polymorphism._03abstract.info.Circle;
import objectoriented._05polymorphism._03abstract.info.Rectangle;
import objectoriented._05polymorphism._03abstract.info.Shape;

/**
 * 标题: 测试类-求面积-[抽象]编程练习
 *
 * @Author: Jiang
 * @Date: 2020/12/8 13:38
 */
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(4);
        Shape s2 = new Rectangle(6,5);
        System.out.println("圆的面积为:"+s1.area());
        System.out.println("矩形的面积为:"+s2.area());
    }
}
