package basic._09comprehensivecase._2school;

import java.util.List;
import java.util.Scanner;

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
//        td.testSchool();
        //主流程
        td.mainTest();
    }

    /**
     * 主流程
     */
    public void mainTest() {
        TestDemo td = new TestDemo();
        Scanner sc = new Scanner(System.in);
        int input=0,input1=0,input2=0;
        String input3="";
        //创建一个学校
        School school = new School();
        //创建主班学生列表
        Banji mainBanji=new Banji("B001","主学生列表");
        //将主学生列表添加到学校
        school.addBanji(mainBanji);
        //普通班级
        Banji normalBanji=null;
        //是否退出
        boolean islogout = false;
        while (true) {
            td.mainMenu();
            System.out.println("请输入对应数字进行操作:");
            input = sc.nextInt();
            if (input == 0) { //完善退出逻辑,增加二次确认
                System.out.println("确认要退出系统吗？(Y/N)");
                String logout=sc.next();
                if (logout.toUpperCase().equals("Y")) {
                    System.out.println("已退出系统!");
                    break;
                } else if(logout.toUpperCase().equals("N")) {
                    continue;
                } else {
                    while(true){
                        System.out.println("请输入Y或N选择是否退出系统：");
                        logout=sc.next();
                        if (logout.toUpperCase().equals("Y")) {
                            System.out.println("已退出系统!");
                            islogout = true;
                            break;
                        } else if(logout.toUpperCase().equals("N")) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (islogout){
                        break;
                    } else{
                        continue;
                    }
                }
            }
            switch (input) {
                case 1:
                    //班级管理
                    while (true) {
                        td.banjiMenu();
                        System.out.println("请输入对应数字进行操作:");
                        input1 = sc.nextInt();
                        if (input1 == 9) {
                            break;
                        }
                        switch (input1) {
                            case 1:
                                System.out.println("将学生添加到主学生列表");
                                System.out.println("请输入要添加的学生的数量：");
                                int count=sc.nextInt();
                                for(int i=1;i<=count;i++){
                                    System.out.println("请输入第"+i+"个学生信息：");
                                    System.out.println("请输入学生学号:");
                                    String stuId=sc.next();
                                    System.out.println("请输入学生姓名:");
                                    String stuName=sc.next();
                                    //创建学生类的对象
                                    Student student=new Student(stuId,stuName);
                                    mainBanji.addStudent(student);
                                }
                                mainBanji.displayAllStudent();
                                break;
                            case 2:
                                System.out.println("将学生添加到普通班级");
                                System.out.println("请输入要添加的班级名称：");
                                String cName=sc.next();
                                //根据名称判断班级是否在学校中存在
                                normalBanji=school.searchByName(cName);
                                if(normalBanji==null){
                                    System.out.println("未查询到此班级");
                                }else{
                                    System.out.println("请输入要添加的学生数量：");
                                    int count1=sc.nextInt();
                                    for(int i=1;i<=count1;i++){
                                        System.out.println("请输入第"+i+"个学生信息：");
                                        System.out.println("请输入学生学号:");
                                        String stuId=sc.next();
                                        //首先判断该id的学生是否在主学生列表存在
                                        Student student=mainBanji.searchStudentByNum(stuId);
                                        if(student==null){
                                            //如果学生不存在，则创建新的添加，并且添加到主学生列表
                                            System.out.println("该学生在主学生列表不存在，继续输入学生的其他信息！");
                                            System.out.println("请输入学生姓名:");
                                            String stuName=sc.next();
                                            //创建一个Student类的对象
                                            student =new Student(stuId,stuName);
                                            //分别将学生添加到普通班级和主学生列表
                                            normalBanji.addStudent(student);
                                            mainBanji.addStudent(student);
                                        }else{
                                            //如果学生存在于主学生列表，则直接添加到现在的班级
                                            normalBanji.addStudent(student);
                                            System.out.println("该学生在主学生列表中已存在,已直接添加入当前列表！");
                                        }
                                    }
                                    //显示班级中的学生信息
                                    System.out.println("【主学生列表】");
                                    mainBanji.displayAllStudent();
                                    System.out.println("【普通班级】");
                                    normalBanji.displayAllStudent();
                                }
                                break;
                            case 3:
                                System.out.println("通过学号查询学生信息");
                                System.out.println("请输入要查询的班级名称：");
                                String strClassName1=sc.next();
                                //查询班级是否存在
                                Banji bj=school.searchByName(strClassName1);
                                if(bj==null){
                                    System.out.println("该班级不存在");break;
                                }else{
                                    System.out.println("请输入要查询的学生学号：");
                                    String stuId1=sc.next();
                                    Student s=bj.searchStudentByNum(stuId1);
                                    if(s==null){
                                        System.out.println("该学生在班级【"+strClassName1+"】中不存在！");
                                    }else{
                                        System.out.println("该学生的信息为：");
                                        System.out.println(s);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("输入班级的语文成绩");
                                System.out.println("请输入要查询的班级名称：");
                                String strClass2=sc.next();
                                //查询班级是否存在
                                Banji bj1=school.searchByName(strClass2);
                                if(bj1==null){
                                    System.out.println("该班级不存在");break;
                                }else{
                                    List<Student> stuList = bj1.getStuList();
                                    if (stuList.isEmpty()) {
                                        System.out.println("该班级暂无学生，请先添加学生信息");
                                    } else {
                                        for (Student stu : stuList) {
                                            System.out.println("学生id：" + stu.getStuNum() + "学生姓名：" + stu.getStuName());
                                            System.out.println("请输入学生语文成绩：");
                                            Float chinese = sc.nextFloat();
                                            bj1.insertChineseScore(stu.getStuNum(),chinese);

                                        }
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("输入班级的数学成绩");
                                System.out.println("请输入要查询的班级名称：");
                                String strClass3=sc.next();
                                //查询班级是否存在
                                Banji bj2=school.searchByName(strClass3);
                                if(bj2==null){
                                    System.out.println("该班级不存在");break;
                                }else{
                                    List<Student> stuList = bj2.getStuList();
                                    if (stuList.isEmpty()) {
                                        System.out.println("该班级暂无学生，请先添加学生信息");
                                    } else {
                                        for (Student stu : stuList) {
                                            System.out.println("学生id：" + stu.getStuNum() + "学生姓名：" + stu.getStuName());
                                            System.out.println("请输入学生数学成绩：");
                                            Float math = sc.nextFloat();
                                            bj2.insertMathScore(stu.getStuNum(),math);

                                        }
                                    }
                                }
                                break;
                            case 6:
                                System.out.println("删除学生信息");
                                System.out.println("请输入要删除学生所在的班级名称：");
                                String strClassName4=sc.next();
                                //查询班级是否存在
                                Banji bj3=school.searchByName(strClassName4);
                                if(bj3==null){
                                    System.out.println("该班级不存在");break;
                                }else{
                                    System.out.println("请输入要删除的学生学号：");
                                    String stuId2=sc.next();
                                    bj3.deleteStudent(stuId2);
                                }
                                break;
                            case 7:
                                System.out.println("显示班级中的所有学生");
                                System.out.println("请输入要查询的班级名称：");
                                String strClassName5=sc.next();
                                //查询班级是否存在
                                Banji bj4=school.searchByName(strClassName5);
                                if(bj4==null){
                                    System.out.println("该班级不存在");break;
                                }else{
                                    bj4.displayAllStudent();
                                }
                                break;
                            default:
                                System.out.println("没有对应的操作！");
                                break;
                        }
                    }
                    break;
                case 2:
                    //学校管理
                    while (true) {
                        td.schoolMenu();
                        System.out.println("请输入对应的数字对学校进行管理：");
                        input2 = sc.nextInt();
                        if (input2 == 9)
                            break;
                        switch (input2) {
                            case 1:
                                System.out.println("向学校添加班级");
                                System.out.println("请输入班级编号：");
                                String classId=sc.next();
                                System.out.println("请输入班级名称：");
                                String className=sc.next();
                                //创建一个新的班级对象
                                normalBanji=new Banji(classId,className);
                                //将班级添加到学校Map
                                school.addBanji(normalBanji);
                                break;
                            case 2:
                                System.out.println("删除班级");
                                System.out.println("请输入要删除的班级名称：");
                                String strClassName=sc.next();
                                if(strClassName.equals("主学生列表")){
                                    System.out.println("主学生列表不能删除");
                                    break;
                                }
                                //查询班级是否存在
                                Banji bj1=school.searchByName(strClassName);
                                if(bj1==null){
                                    System.out.println("该班级不存在");
                                }else{
                                    //存在则删除
                                    school.deleteBanji(bj1);
                                }
                                break;
                            case 3:
                                System.out.println("通过班级名称查询班级信息");
                                System.out.println("请输入要查询的班级名称：");
                                String strClass1=sc.next();
                                Banji bj2=school.searchByName(strClass1);
                                if(bj2==null){
                                    System.out.println("该班级不存在");
                                }else{
                                    //显示班级信息
                                    System.out.println("班级信息：[班级编号："+bj2.getClassId()+",班级名称："+bj2.getClassName()+"]");
                                }
                                break;
                            case 4:
                                System.out.println("对各班语文成绩按平均分进行由大到小排序");
                                school.sortChineseByAverage();break;
                            case 5:
                                System.out.println("对各班数学成绩按平均分进行由大到小排序");
                                school.sortMathByAverage();break;
                            case 6:
                                System.out.println("显示所有班级名称");
                                school.displayBanJiName();
                                break;
                            default:
                                System.out.println("没有对应的操作！");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("没有对应的操作！");
                    break;
            }
        }
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
        Banji newBanji = new Banji("b002","一班");
        newBanji.addStudent(mainBanji.getStuList().get(0));
        newBanji.addStudent(mainBanji.getStuList().get(1));
        newBanji.displayAllStudent();
        Banji newBanji2 = new Banji("b003","二班");
        newBanji2.addStudent(mainBanji.getStuList().get(2));
        newBanji2.addStudent(mainBanji.getStuList().get(1));
        newBanji2.displayAllStudent();
        //将两个学生列表添加到学校中
        School school = new School();
        school.addBanji(mainBanji);
        school.addBanji(newBanji);
        school.addBanji(newBanji2);
        school.displayBanJiName();
        //根据名字查询学生列表,并显示学生列表中所有学生
        Banji banji = school.searchByName("一班");
        banji.displayAllStudent();
        //各班级语文平均分排序
        school.sortChineseByAverage();
        //各班级数学平均分排序
        school.sortMathByAverage();
        //删除班级列表
//        System.out.println("删除前:");
//        school.displayBanJiName();
//        school.deleteBanji(banji);
//        System.out.println("删除后:");
//        school.displayBanJiName();
    }
}
