package objectoriented._05polymorphism._02test1.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 11:14
 */
public class Cat extends Animal{
    public Cat() {
    }

    @Override
    public void cry() {
        System.out.println("小猫的叫声:喵喵喵~~~");
    }
}
