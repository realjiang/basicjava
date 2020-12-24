package _05collection._4sort.comparator._2test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:45
 */
//实现Comparator接口
public class StudentTest implements Comparator<Student> {
    //实现接口中的方法
    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int i = name1.compareTo(name2);
        return i;
    }

    public static void main(String[] args){
        //定义Student类的对象
        Student s1 = new Student(40, "peter", 20);
        Student s2 = new Student(28, "angel", 5);
        Student s3 = new Student(35, "tom", 18);
        //将对象添加到List中
        List<Student> ss = new ArrayList<>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        //输出排序前的数据
        System.out.println("按名字排序前:");
        for (Student s: ss) {
            System.out.println(s);
        }
        //排序
//        Collections.sort(ss, new StudentTest());//方式一
        ss.sort(new StudentTest());//方式二
        //输出排序后的数据
        System.out.println("按名字排序后:");
        for (Student s: ss) {
            System.out.println(s);
        }
    }
}
