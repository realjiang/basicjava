package _05collection._4sort.comparator._1demo;

import java.util.*;

/**
 * 标题: 测试类 - 需要另外写类来实现Comparator接口
 *
 * @Author: Jiang
 * @Date: 2020/12/23 12:55
 */
public class CatTest {
    public static void main(String[] args) {
        //定义宠物猫对象
        Cat huahua = new Cat("huahua", 5, "英国短毛猫");
        Cat fanfan = new Cat("fanfan", 2, "中华田园猫");
        Cat maomao = new Cat("maomao", 3, "中华田园猫");
        List<Cat> cats = new ArrayList<>();
        cats.add(huahua);
        cats.add(fanfan);
        cats.add(maomao);
        //排序前
        System.out.println("按名字排序前:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        //排序 - 按名字进行升序排序
        Collections.sort(cats,new NameComparator());//第二个参数是比较器对象
        //排序后
        System.out.println("按名字排序后:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("****************************");
        //排序前
        System.out.println("按年龄排序前:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        //排序 - 按年龄进行降序排序
        Collections.sort(cats,new AgeComparator());
        //排序后
        System.out.println("按年龄排序后:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
