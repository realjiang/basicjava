package objectoriented._03extends._01animal.info;

/**
 * 标题: 动物
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:45
 */
public class Animal {
    public static String name;
    private int month;
    private String species;
    public String hh;
    //父类的构造方法不允许被继承,不允许被重写
    public Animal() {
        System.out.println("父类无参构造");
    }

    public Animal(String name) {
        System.out.println(name);
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


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void eat() {
        System.out.println(this.getName()+"在吃东西");
    }

    public Object jump() {
        System.out.println("动物跳跃是本能");
        return "test重写";
    }
}
