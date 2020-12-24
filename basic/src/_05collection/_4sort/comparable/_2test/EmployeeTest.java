package _05collection._4sort.comparable._2test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/24 14:11
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("emp001", "张三", 9999);
        Employee e2 = new Employee("emp002", "李四", 12345);
        Employee e3 = new Employee("emp003", "王五", 8888);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println("按工资排序前:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        Collections.sort(employeeList);
        System.out.println("按工资降序排序后:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
