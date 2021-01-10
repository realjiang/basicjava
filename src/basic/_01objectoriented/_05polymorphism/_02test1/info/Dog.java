package _01objectoriented._05polymorphism._02test1.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 11:14
 */
public class Dog extends Animal{
    public Dog() {
    }
    @Override
    public void cry() {
        System.out.println("小狗的叫声:汪汪汪~~~");
    }
}
