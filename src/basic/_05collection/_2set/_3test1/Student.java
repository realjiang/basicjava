package basic._05collection._2set._3test1;

import java.util.Objects;

/**
 * 标题: 学生类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 17:29
 */
public class Student {
    private int stuId;//学号
    private String name;//姓名
    private float score;//成绩

    public Student() {
    }

    public Student(int stuId, String name, float score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                "[学号:" + stuId +
                ", 姓名:" + name +
                ", 成绩:" + score +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() == Student.class) {
            Student student = (Student) o;
            return getStuId() == student.getStuId() &&
                    getName().equals(student.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuId(), getName(), getScore());
    }
}
