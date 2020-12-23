package _05collection._2set._2demo2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/23 12:55
 */
public class CatTest {
    public static void main(String[] args) {
        //定义宠物猫对象
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 12, "中华田园猫");
        //放入HashSet
//        Set set = new HashSet();
        Set<Cat> set = new HashSet(); //引入泛型,消除安全隐患(强转类型失败)
        set.add(huahua);
        set.add(fanfan);
        //显示宠物猫信息
//        Iterator it = set.iterator();
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("**********************************");
        //添加一个与花花属性一样的猫
        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        set.add(huahua01);
        System.out.println("添加重复数据后的信息:");
        //显示宠物猫信息
        Iterator it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        // 通过重写hashCode方法和equals方法,判断两只猫的信息是否相等
        //重写后,就不能添加属性相同的数据了
        System.out.println("**********************************");
        //重新插入一个新宠物猫
        Cat huahua02 = new Cat("花花二代", 2, "英国短毛猫");
        set.add(huahua02);
        System.out.println("添加花花二代后的宠物猫信息:");
        //显示宠物猫信息
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        System.out.println("**********************************");
        //在集合中查找花花的信息,并输出
        if (set.contains(huahua)) {
            System.out.println("花花找到了");
            System.out.println(huahua);
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("**********************************");
        //在集合中使用名字查找花花信息
        boolean flag = false;
        Cat c = null;
        Iterator<Cat> it4 = set.iterator();
        while(it4.hasNext()){
//            c = (Cat) it4.next();
            c = it4.next(); //引入了泛型,就不用强制转换类型了
            if (c.getName().equals("花花")) {
                flag = true; //找到了
                break;
            }
        }
        if (flag) {
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("花花没找到");
        }
        System.out.println("**********************************");
        //删除花花二代的信息并重新输出- 引用泛型后,可以使用增强for循环
        for (Cat cat:set) { //正常情况不允许一遍读取一遍删除,这里刚好花花二代是最后一个元素所以没有报错
            if ("花花二代".equals(cat.getName())) {
                set.remove(cat);
            }
        }
        for (Cat cat:set) { //加break解决这个问题
            if ("花花".equals(cat.getName())) {
                set.remove(cat);break;
            }
        }
        //解决有多个符合条件结果要删除的情况,使用removeAll传入set或set的子集
        Set<Cat> set1 = new HashSet<>();
        for (Cat cat:set) { //加break解决这个问题
            if (cat.getMonth()<5) {
                set1.add(cat);
            }
        }
        set.removeAll(set1);
        System.out.println("**********************************");
        System.out.println("删除花花二代后的数据:");
        for (Cat cat:set) {
            System.out.println(cat);
        }
        //删除集合中的所有元素
        boolean flag1 = set.removeAll(set);
        if (flag1) {
            System.out.println("猫都不见了...");
        } else {
            System.out.println("猫还在!");
        }
        if (set.isEmpty()) { //判断集合为空,方式二
            System.out.println("猫都不见了...");
        } else {
            System.out.println("猫还在!");
        }
    }
}
