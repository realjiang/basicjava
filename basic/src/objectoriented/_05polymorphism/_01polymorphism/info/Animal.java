package objectoriented._05polymorphism._01polymorphism.info;

/**
 * 标题: 动物
 *
 * @Author: Jiang
 * @Date: 2020/12/8 9:58
 */
public class Animal {
    private String name;
    private int month;

    public void eat() {
        System.out.println("动物得吃东西");
    }

    public static void say() {
        System.out.println("动物喊叫");
    }

    public Animal() {
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
