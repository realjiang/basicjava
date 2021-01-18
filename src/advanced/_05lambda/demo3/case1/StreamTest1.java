package advanced._05lambda.demo3.case1;

import java.util.stream.Stream;

/**
 * 标题: 使用流对象循环输出学生信息。
 *
 * @Author: Jiang
 * @Date: 2021/1/18 13:51
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student[] stus = {new Student("张铭", "男", "一班"),
                new Student("小红", "女", "一班"),
                new Student("丽丽", "女", "一班")};
        Stream<Student> stus1 = Stream.of(stus);
        stus1.forEach(stu-> System.out.println(stu));
    }
}
