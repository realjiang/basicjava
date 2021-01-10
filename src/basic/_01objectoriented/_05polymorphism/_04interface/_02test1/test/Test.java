package _01objectoriented._05polymorphism._04interface._02test1.test;

import _01objectoriented._05polymorphism._04interface._02test1.info.Balloon;
import _01objectoriented._05polymorphism._04interface._02test1.info.Bird;
import _01objectoriented._05polymorphism._04interface._02test1.info.Plane;

/**
 * 标题:测试类 - 接口编程练习
 *
 * @Author: Jiang
 * @Date: 2020/12/8 15:14
 */
public class Test {
    public static void main(String[] args) {
        //对象实例化
        Plane f1 = new Plane();
        Bird f2 = new Bird();
        Balloon f3 = new Balloon();
        //调用fly方法
        f1.fly();
        f2.fly();
        f3.fly();

    }
}
