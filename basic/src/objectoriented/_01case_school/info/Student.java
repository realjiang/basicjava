package objectoriented._01case_school.info;

/**
 * 标题: 学生
 *
 * @Author: Jiang
 * @Date: 2020/11/27 15:39
 */
public class Student {
    private String sname;
    private String sno;
    private String sex;
    private int age;
    //方案三,将另一个类设为成员属性,来关联两个类
    private Major major;


    public Student() {
    }

    public Student(String sname, String sno, String sex, int age) {
        this.setSname(sname);
        this.setSno(sno);
        this.setSex(sex);
        this.setAge(age);
        this.setMajor(major);
    }

    public Student(String sname, String sno, String sex, int age ,Major major) {
        this.setSname(sname);
        this.setSno(sno);
        this.setSex(sex);
        this.setAge(age);
        this.setMajor(major);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSex() {
        return sex;
    }
    //给性别赋值,只能"男"或"女",否则赋值为"男"
    public void setSex(String sex) {
        if (!"男".equals(sex) && !"女".equals(sex)) {
            this.sex = "男";
        } else {
        this.sex = sex;
        }
    }

    public int getAge() {
        return age;
    }
    //给年龄赋值,限定10-100之间,反之赋值为18
    public void setAge(int age) {
        if (age < 10 || age > 100) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public Major getMajor() {
        // 如果Major类之前没有被实例化,那就将它实例化再返回
        if (this.major == null) {
            this.major = new Major();
        }
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    //显示信息
    //方案一,通过字符串传参
    //方案二,通过对象传参,关联两个类
    public String showStudentInfo(Major major) {
        String info = "学生信息如下:\n姓名:" + sname + "\n学号:" + sno +"\n性别:"
                + sex + "\n年龄:" + age + "\n所报专业名称:" + major.getMname() + "\n学制年限:" +major.getMajorlife();
        return info;
    }
    //方案三
    public String showStudentInfo() {
        String info = "学生信息如下:\n姓名:" + sname + "\n学号:" + sno +"\n性别:"
                + sex + "\n年龄:" + age + "\n所报专业名称:" + this.getMajor().getMname()
                + "\n学制年限:" +this.getMajor().getMajorlife(); //直接用属性调用major.getXXX也可以,但是可能会有问题
        return info;
    }
}
