package _05collection._1list._4test2;

/**
 * 标题:员工类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 10:20
 */
public class Employee {
    private String id;//ID
    private String name;//姓名
    private double salary;//工资

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
