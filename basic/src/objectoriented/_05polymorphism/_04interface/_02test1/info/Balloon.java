package objectoriented._05polymorphism._04interface._02test1.info;

/**
 * 标题:气球
 *
 * @Author: Jiang
 * @Date: 2020/12/8 15:14
 */
public class Balloon implements IFly{
    @Override
    public void fly() {
        System.out.println("气球飞上天空");
    }
}
