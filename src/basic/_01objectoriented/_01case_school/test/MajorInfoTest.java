package _01objectoriented._01case_school.test;

import _01objectoriented._01case_school.info.Major;
import _01objectoriented._01case_school.info.Student;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/11/27 15:51
 */
public class MajorInfoTest {
    public static void main(String[] args) {
        Major mj1 = new Major("计算机科学与应用","J0001",-4);
        System.out.println(mj1.showMajorInfo());
        System.out.println("===============================");
        Student std1 = new Student("张三","S01","哈哈",200,mj1);
        System.out.println(std1.showStudentInfo());
    }
}
