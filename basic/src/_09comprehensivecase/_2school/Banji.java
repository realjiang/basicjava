package src._09comprehensivecase._2school;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级类
 */
public class Banji {
    private String classId;//班级编号
    private String className;//班级名称
    List<Student> stuList;//学生集合

    /**
     * 构造方法
     * @param classId 班级编号
     * @param className 班级名称
     */
    public Banji(String classId, String className) {
        this.setClassId(classId);
        this.setClassName(className);
        stuList = new ArrayList<>();
    }

    /**
     * get和set方法
     * @return value
     */
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    /**
     * 将学生添加到班级
     * @param stu 学生对象
     */
    public void addStudent(Student stu) {
        //是否已存在该学生信息,以防重复添加
        boolean flag = false;
        for (Student student : stuList) {
            if (student.equals(stu)) {
                flag = true;
                break;
            }
        }
        if (flag) { //如果已存在,给出提示;如果不存在,则将学生信息添加到班级
            System.out.println("学号:"+stu.getStuNum()+",姓名:"+stu.getStuName()+"的学生信息已存在于班级列表中,添加失败!");
        } else {
            stuList.add(stu);
            System.out.println("添加成功");
        }
    }

    /**
     * 通过学号查询学生在班级中是否存在
     * @param stuNum 学号
     * @return 学生信息
     */
    public Student searchStudentByNum(String stuNum) {
        Student student = null;
        if (stuList.isEmpty()) {
            System.out.println("该班级暂无学生!");
        } else {
            for (Student student1 : stuList) {
                if (student1.getStuNum().equals(stuNum)) {
                    //如果学号相等,说明找到了
                    student = student1;break;
                }
            }
        }
        return student;
    }

    /**
     * 输入班级学生的语文成绩
     * @param stuNum 学号
     * @param score 语文成绩
     */
    public void insertChineseScore(String stuNum, float score) {//todo 逻辑需修改，选择班级后，回显各个学生信息，并添加成绩
        Student student = searchStudentByNum(stuNum);
        student.setChinese(score);
        System.out.println("添加语文成绩成功");
    }

    /**
     * 输入班级学生的数学成绩
     * @param stuNum 学号
     * @param score 数学成绩
     */
    public void insertMathScore(String stuNum, float score) { //todo 逻辑需修改，选择班级后，回显各个学生信息，并添加成绩
        Student student = searchStudentByNum(stuNum);
        student.setMath(score);
        System.out.println("添加数学成绩成功");
    }

    /**
     * 删除学生信息
     * @param stuNum 学号
     */
    public void deleteStudent(String stuNum) {
        Student student = searchStudentByNum(stuNum);
        if (student != null) {
            stuList.remove(student);
            System.out.println("删除成功");
        } else {
            System.out.println("没有找到学号为"+stuNum+"的学生信息");
        }
    }

    /**
     * 显示所有学生的信息（包括学号和姓名）
     */
    public void displayAllStudent() {
        if (stuList.isEmpty()) {
            System.out.println("该班级暂无学生");
        } else {
            for (Student student : stuList) {
                System.out.println(student);
            }
        }
    }
}
