package _01objectoriented._05polymorphism._02test1.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 11:14
 */
public class Sheep extends Animal{
    public Sheep() {
    }
    @Override
    public void cry() {
        System.out.println("小羊的叫声:咩咩咩~~~");
    }
}
