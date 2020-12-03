package objectoriented._03extends.animal.info;

/**
 * 标题: 动物
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:45
 */
public class Animal {
    private String name;
    private int month;
    private String species;

    public Animal() {
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
