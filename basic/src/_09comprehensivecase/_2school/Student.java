package src._09comprehensivecase._2school;

import java.util.Objects;

/**
 * 学生类
 */
public class Student{
    private String stuNum;//学号
    private String stuName;//姓名
    private float math;//数学成绩
    private float chinese;//语文成绩

    /**
     * 构造方法
     * @param stuNum 学号
     * @param stuName 姓名
     * @param math 数学成绩
     * @param chinese 语文成绩
     */
    public Student(String stuNum, String stuName, float math, float chinese) {
        this.setStuNum(stuNum);
        this.setStuName(stuName);
        this.setMath(math);
        this.setChinese(chinese);
    }

    /**
     * get和set方法
     */
    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    /**
     * 重写equals方法
     * @param o 对象
     * @return 布尔值
     */
    @Override
    public boolean equals(Object o) {
        //如果是相同对象,返回true
        if (this == o) return true;
        if (o.getClass() == Student.class) {
            //如果同是Student类型,才能强制转换
            Student student = (Student) o;
            return student.getStuNum().equals(stuNum) && student.getStuName().equals(stuName); //如果学号和姓名相同表示是同一个学生
        }
        return false;
    }

    /**
     * 重写hashCode方法
     * @return 是否相等 布尔值
     */
    @Override
    public int hashCode() {
        return Objects.hash(getStuNum(), getStuName(), getMath(), getChinese());
    }

    /**
     * 重写toString方法
     * @return str
     */
    @Override
    public String toString() {
        return "学生信息:" +
                "学号为:" + stuNum +
                ",姓名为:" + stuName +
                ", 数学成绩为:" + math +
                ", 语文成绩为:" + chinese;
    }
}
