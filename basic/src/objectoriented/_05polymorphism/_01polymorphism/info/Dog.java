package objectoriented._05polymorphism._01polymorphism.info;

/**
 * 标题: 狗
 *
 * @Author: Jiang
 * @Date: 2020/12/8 9:58
 */
public class Dog extends Animal {
    private String sex;

    public void sleep() {
        System.out.println("小狗爱睡觉");
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉~~");
    }

    public Dog() {
    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
