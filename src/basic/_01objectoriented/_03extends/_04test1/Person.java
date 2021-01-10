package _01objectoriented._03extends._04test1;

/**
 * 标题: PERSON类
 *
 * @Author: Jiang
 * @Date: 2020/12/7 16:36
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    /**
     * 重写Object的toString方法
     * @return str
     */
    public String toString() {
        String str = "姓名:"+this.getName()+"    年龄:"+this.getAge()+"    性别:"+this.getSex();
        return str;
    }

    /**
     * 无参构造
     */
    public Person() {
    }

    /**
     * 全参构造
     * @param name 姓名
     * @param age 年龄
     * @param sex 性别
     */
    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
