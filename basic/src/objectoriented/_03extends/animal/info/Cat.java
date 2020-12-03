package objectoriented._03extends.animal.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:48
 */
public class Cat extends Animal {
    private int weight;

    public Cat() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName()+"是一只"+this.getSpecies()+"，它在快乐地奔跑。。。");
    }

    /**
     * 重写Animal的jump方法
     */
    public String jump() {
        System.out.println("动物跳跃是本能");
        return "test重写";
    }
    /**
     * 方法重写-对于返回值类型的要求:
     * 1.父类返回值是void或基本类型时,子类返回值类型必须与父类中的一致;
     * 2.父类返回值是引用类型时,子类返回值可以是父类的返回值类型,或父类返回值类型的子类类型.
     * 注:String是final类，不能有子类,因此虽String属于引用类型,当父类返回值类型为String,子类返回值类型也需是String类型!
     */
}
