package basic._05collection._2set._3test1;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 17:28
 */
public class StudentTest {
    /**
     * 1、 定义一个学生类Student
     * （1）属性为：学号stuId（int），姓名name（String），成绩score（float）
     * （2）方法为：构造方法，getter和setter方法，toString方法
     * （3）重写hashCode()和equals()方法，equals方法的判断依据是学号和姓名相等
     * 2、定义三个Student类的对象，添加到HashSet中
     * 3、显示HashSet中元素的内容
     * 4、添加一个重复数据到Set中，观察输出结果
     */
    public static void main(String[] args) {
        //定义三个Student类的对象及一个HashSet类的对象
        Student s1 = new Student(1, "Tom", 87);
        Student s2 = new Student(2, "Lucy", 95);
        Student s3 = new Student(3, "William", 65);
//        Set set = new HashSet();
        Set<Student> set = new HashSet();
        //将Student类的对象添加到集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        //使用迭代器显示Student类的对象中的内容
//        Iterator it = set.iterator();
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //再添加一个重复数据
        Student s4 = new Student(3, "William", 65);
        set.add(s4);
        //使用迭代器显示Student类的对象中的内容
        Iterator<Student> it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
