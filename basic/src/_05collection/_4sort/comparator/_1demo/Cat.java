package _05collection._4sort.comparator._1demo;

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
}
