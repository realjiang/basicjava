package _09comprehensivecase._2school;

/**
 * 学校管理案例- 测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        //测试学生类
//        td.testStu();
        //测试班级类
        td.testBanji();
        //测试学校类
//        td.testSchool();
        //注流程
//        td.mainTest();
    }

    /**
     * 主流程
     */
    public void mainTest() {

    }

    /**
     * 主菜单
     */
    public void mainMenu() {

    }
    /**
     * 班级管理菜单
     */
    public void banjiMenu() {

    }
    /**
     * 学校管理菜单
     */
    public void schoolMenu() {

    }

    /**
     * 测试学生类
     */
    public void testStu() {
        Student s1 = new Student("s001", "小红", 98, 88.8f);
        Student s2 = new Student("s002", "小黄", 66, 78.6f);
        Student s3 = new Student("s003", "小蓝", 100, 90);
        Student s4 = new Student("s003", "小蓝", 43, 88.8f);
        System.out.println(s1);
        //测试两个学生对象是否相等
        System.out.println("s1==s3?"+s1.equals(s3));
        System.out.println("s4==s3?"+s4.equals(s3));
    }

    /**
     * 测试班级类
     */
    public void testBanji() {
        //创建学生信息
        Student s1 = new Student("s001", "小红", 98, 88.8f);
        Student s2 = new Student("s002", "小黄", 66, 78.6f);
        Student s3 = new Student("s003", "小蓝", 100, 90);
        Student s4 = new Student("s003", "小蓝", 43, 88.8f);
        //创建主班级列表信息
        Banji bj = new Banji("c001","主班级列表");
        //将学生信息添加到主班级列表
        bj.addStudent(s1);
        bj.addStudent(s2);
        bj.addStudent(s3);
        bj.addStudent(s4);
        //显示班级列表中所有学生信息
        bj.displayAllStudent();
        //通过学号查学生
        Student student1 = bj.searchStudentByNum("s001");
//        Student student1 = bj.searchStudentByNum("s009");
        if (student1 != null) {
            System.out.println("根据学号查询的学生信息为:\n"+student1);
        } else {
            System.out.println("该学生不存在!");
        }
        //添加数学成绩
        bj.insertMathScore("s001",88);
        //添加语文成绩
        bj.insertChineseScore("s001",86);
    }

    /**
     * 测试学校类
     */
    public void testSchool() {

    }
}
