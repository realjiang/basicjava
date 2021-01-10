package basic._05collection._1list._4test2;

import java.util.ArrayList;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 10:18
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //定义三个员工信息添加到ArrayList
        Employee e1 = new Employee("1", "张三", 5000.0);
        Employee e2 = new Employee("2", "李四", 5000.0);
        Employee e3 = new Employee("3", "王五", 5000.0);
        ArrayList list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        //输出员工信息
        System.out.println("员工姓名    员工薪资");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(((Employee)(list.get(i))).getName()+"        "+((Employee)(list.get(i))).getSalary());
        }
    }
    /** 运行结果:
     * 员工姓名    员工薪资
     * 张三        5000.0
     * 李四        5000.0
     * 王五        5000.0
     */
}
