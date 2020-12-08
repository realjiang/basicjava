package objectoriented._05polymorphism._01polymorphism.info;

/**
 * 标题:
 *
 * @Author: Jiang yuting
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
}
