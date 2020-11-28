package objectoriented._02officesystem.test;

import objectoriented._02officesystem.info.Department;
import objectoriented._02officesystem.info.Post;
import objectoriented._02officesystem.info.Staff;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/11/28 12:59
 */
public class SystemTest {
    public static void main(String[] args) {
        /**初始化部门*/
        Department d1 = new Department("D001","人事部");
        Department d2 = new Department("D002","市场部");
        /**初始化职务*/
        Post p1 = new Post("P001","经理");
        Post p2 = new Post("P002","助理");
        Post p3 = new Post("P003","职员");
        /**初始化员工*/
        Staff s1 = new Staff("张铭", "S001", "男", 29,p1);
        Staff s2 = new Staff("李艾爱", "S002", "女", 21,p2);
        Staff s3 = new Staff("孙超", "S003", "男", 29,p3);
        Staff s4 = new Staff("张美美", "S004", "女", 26,p3);
        Staff s5 = new Staff("蓝迪", "S005", "男", 37,p1);
        Staff s6 = new Staff("米莉", "S006", "女", 24,p3);
        /**向部门中添加员工*/
        d1.addStaff(s1);
        d1.addStaff(s2);
        d1.addStaff(s3);
        d2.addStaff(s4);
        d2.addStaff(s5);
        d2.addStaff(s6);
        /**输出员工信息*/
        System.out.println(s1.showInfo());
        System.out.println(s2.showInfo());
        System.out.println(s3.showInfo());
        System.out.println(s4.showInfo());
        System.out.println(s5.showInfo());
        System.out.println(s6.showInfo());
        /**输出部门员工数量信息*/
        System.out.println(d1.getNumOfStaff());
        System.out.println(d2.getNumOfStaff());
    }
    /** 运行结果
     * 姓名:张铭
     * 工号:S001
     * 性别:男
     * 年龄:29
     * 职务:人事部经理
     * ===========================================
     * 姓名:李艾爱
     * 工号:S002
     * 性别:女
     * 年龄:21
     * 职务:人事部助理
     * ===========================================
     * 姓名:孙超
     * 工号:S003
     * 性别:男
     * 年龄:29
     * 职务:人事部职员
     * ===========================================
     * 姓名:张美美
     * 工号:S004
     * 性别:女
     * 年龄:26
     * 职务:市场部职员
     * ===========================================
     * 姓名:蓝迪
     * 工号:S005
     * 性别:男
     * 年龄:37
     * 职务:市场部经理
     * ===========================================
     * 姓名:米莉
     * 工号:S006
     * 性别:女
     * 年龄:24
     * 职务:市场部职员
     * ===========================================
     * 人事部总共有3名员工
     * 市场部总共有3名员工
     */
}
