package _05collection._4sort.comparator._2test;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:45
 */
public class Student {
    //成员变量
    private int sno;//学号
    private String name;//姓名
    private int age;//年龄
    //构造方法
    public Student() {
    }

    public Student(int sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }
    //getter和setter方法
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //toString()方法

    @Override
    public String toString() {
        return "[学号:" + sno +
                ", 年龄:" + age +
                ", 姓名:" + name +
                ']';
    }
}
