package src._09comprehensivecase._2school;

import java.util.List;

/**
 * 班级类
 */
public class Banji {
    private String classId;//班级编号
    private String className;//班级名称
    List<Student> stuList;//学生集合

    //构造方法
    //get和set方法
    //将学生添加到班级
    public void addStudent(Student stu){}
    //通过学号查询学生在班级中是否存在：
    public Student searchStudentByNum(String stuNum){return null;}
    //输入班级学生的语文成绩：
    public void insertChineseScore(String stuNum,float score){}
    //输入班级学生的数学成绩：
     public void insertMathScore(String stuNum,float score){}
    //删除学生信息：
     public void deleteStudent(String stuNum){}
    //显示所有学生的信息（包括学号和姓名）：
     public void displayAllStudent(){}
}
