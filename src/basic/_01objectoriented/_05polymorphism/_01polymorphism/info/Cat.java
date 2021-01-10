package _01objectoriented._05polymorphism._01polymorphism.info;

/**
 * 标题: 猫
 *
 * @Author: Jiang
 * @Date: 2020/12/8 9:58
 */
public class Cat extends Animal{
    private double weight;

    public void run() {
        System.out.println("小喵爱跑动");
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼~~");
    }

    public static void say() {
        System.out.println("喵~");
    }
    public Cat() {
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void playball() {
        System.out.println("小猫喜欢玩线球");
    }
}
