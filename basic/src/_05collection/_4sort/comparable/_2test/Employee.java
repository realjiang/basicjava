package _05collection._4sort.comparable._2test;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/24 14:10
 */
//实现Comparable接口
public class Employee implements Comparable<Employee>{

    //成员变量
    private String eno;//员工编号
    private String name;//员工姓名
    private double salary;//工资
    //构造方法
    public Employee(String eno, String name, double salary) {
        this.eno = eno;
        this.name = name;
        this.salary = salary;
    }
    //getter和setter方法
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //toString()方法

    @Override
    public String toString() {
        return "员工[编号:" + eno +
                ", 姓名:" + name +
                ", 薪水:" + salary +
                ']';
    }
    //重写comparTo方法
    @Override
    public int compareTo(Employee o) { //按工资降序排序
        double s1 = this.getSalary();
        double s2 = o.getSalary();
        int result = new Double(s2 - s1).intValue();
        return result;
    }
}
