package objectoriented._03extends.animal.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:48
 */
public class Dog extends Animal {
    private int sex;//

    public Dog() {

    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大了，它在睡觉。。。");
    }
}
