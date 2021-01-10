package _01objectoriented._05polymorphism._04interface._02test1.info;

/**
 * 标题:飞机
 *
 * @Author: Jiang
 * @Date: 2020/12/8 15:13
 */
public class Plane implements IFly{
    @Override
    public void fly() {
        System.out.println("飞机在天上飞");
    }
}
