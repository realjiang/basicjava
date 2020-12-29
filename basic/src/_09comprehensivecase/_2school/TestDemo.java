package src._09comprehensivecase._2school;

/**
 * 学校管理案例- 测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        //测试学生类
//        td.testStu();
        //测试班级类
//        td.testBanji();
        //测试学校类
        td.testSchool();
        //主流程
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
        System.out.println("*********************************");
        System.out.println("            **主菜单**            ");
        System.out.println("            1--班级管理");
        System.out.println("            2--学校管理");
        System.out.println("            0--退出");
        System.out.println("*********************************");
    }
    /**
     * 班级管理菜单
     */
    public void banjiMenu() {
        System.out.println("********************************************");
        System.out.println("            **班级管理**            ");
        System.out.println("            1--添加学生信息到主学生列表");
        System.out.println("            2--添加学生信息到普通班级");
        System.out.println("            3--通过学号查询学生信息");
        System.out.println("            4--输入班级的语文成绩");
        System.out.println("            5--输入班级的数学成绩");
        System.out.println("            6--删除学生信息");
        System.out.println("            7--显示所有学生信息");
        System.out.println("            8--导出班级列表");
        System.out.println("            9--返回上一级菜单");
        System.out.println("********************************************");
    }
    /**
     * 学校管理菜单
     */
    public void schoolMenu() {
        System.out.println("********************************************");
        System.out.println("            **学校管理**            ");
        System.out.println("            1--创建班级");
        System.out.println("            2--删除班级");
        System.out.println("            3--通过班级名称查询班级信息");
        System.out.println("            4--对各班语文成绩按平均分进行由大到小排序");
        System.out.println("            5--对各班数学成绩按平均分进行由大到小排序");
        System.out.println("            6--显示所有班级名称");
        System.out.println("            9--返回上一级菜单");
        System.out.println("********************************************");
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
        bj.displayAllStudent();
        //删除学生
        bj.deleteStudent("s003");
        bj.displayAllStudent();
    }

    /**
     * 测试学校类
     */
    public void testSchool() {
        Student s1 = new Student("s001", "小红", 98, 88.8f);
        Student s2 = new Student("s002", "小黄", 66, 78.6f);
        Student s3 = new Student("s003", "小蓝", 100, 90);
        //创建主班级列表
         Banji mainBanji = new Banji("b001","主班级列表");
        //将学生添加到主班级列表
        mainBanji.addStudent(s1);
        mainBanji.addStudent(s2);
        mainBanji.addStudent(s3);
        mainBanji.displayAllStudent();
        //定义一个新的班级列表,从主班级列表添加学生进来
        Banji newBanji = new Banji("b002","新班级");
        newBanji.addStudent(mainBanji.getStuList().get(0));
        newBanji.addStudent(mainBanji.getStuList().get(1));
        newBanji.displayAllStudent();
        //将两个学生列表添加到学校中
        School school = new School();
        school.addBanji(mainBanji);
        school.addBanji(newBanji);
        school.displayBanJiName();
        //根据名字查询学生列表,并显示学生列表中所有学生
        Banji banji = school.searchByName("新班级");
        banji.displayAllStudent();
        //各班级语文平均分排序
        school.sortChineseByAverage();
        //各班级数学平均分排序
        school.sortMathByAverage();
        //删除班级列表
        System.out.println("删除前:");
        school.displayBanJiName();
        school.deleteBanji(banji);
        System.out.println("删除后:");
        school.displayBanJiName();
    }
}
