package _01objectoriented._05polymorphism._04interface._02test1.info;

/**
 * 标题:鸟
 *
 * @Author: Jiang
 * @Date: 2020/12/8 15:13
 */
public class Bird implements IFly{
    @Override
    public void fly() {
        System.out.println("小鸟在天空翱翔");
    }
}
