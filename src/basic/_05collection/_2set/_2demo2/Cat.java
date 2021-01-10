package basic._05collection._2set._2demo2;

import java.util.Objects;

/**
 * 标题: 宠物猫
 *
 * @Author: Jiang
 * @Date: 2020/12/23 12:53
 */
public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat() {
    }

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
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
    //重写toString方法
    @Override
    public String toString() {
        return "Cat{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + month +
                ", 品种='" + species + '\'' +
                '}';
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cat)) return false;
//        Cat cat = (Cat) o;
//        return getMonth() == cat.getMonth() &&
//                Objects.equals(getName(), cat.getName()) &&
//                Objects.equals(getSpecies(), cat.getSpecies());
        if (this == o) return true;//判断是否是同一个对象,如果是,则返回true,不用继续比较属性了
        if (o.getClass() == Cat.class) { // 反射 判断是否是cat类的对象
            Cat cat = (Cat) o;
            return getMonth() == cat.getMonth() &&
                    Objects.equals(getName(), cat.getName()) &&
                    Objects.equals(getSpecies(), cat.getSpecies());
        }
        return false;
    }
    //重写hashCode方法
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getSpecies());
    }

}
