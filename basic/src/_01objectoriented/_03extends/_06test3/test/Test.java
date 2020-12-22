package _01objectoriented._03extends._06test3.test;

import _01objectoriented._03extends._06test3.info.Car;
import _01objectoriented._03extends._06test3.info.HomeCar;
import _01objectoriented._03extends._06test3.info.Taxi;

/**
 * 标题: 测试类 - [继承] 编程练习4
 *
 * @Author: Jiang
 * @Date: 2020/12/7 17:09
 */
public class Test {
    public static void main(String[] args) {
        //实例化父类对象，并传入两组相同的属性值
        Car car1 = new Car("白色","张三");
        Car car2 = new Car("白色","张三");
        //调用父类use方法
        car1.use();
        //通过重写equals方法，比较两个对象是否相等
        System.out.println("car1和car的引用比较："+car1.equals(car2));
        System.out.println("==================================");
        //实例化子类Taxi对象，并传入属性值
        Taxi taxi = new Taxi("蓝","张小泉","长生");
        //调用ride和use方法
        taxi.ride();
        taxi.use();
        //输出重写toString后的taxi信息
        System.out.println(taxi.toString());
        System.out.println("==================================");
        //实例化子类HomeCar对象，并传入属性值
        HomeCar homeCar = new HomeCar("紫","孙二娘",7);
        //调用display方法及它的重载方法
        homeCar.display();
        homeCar.display(5);
    }
    /** 运行结果：
     * 我是机动车！
     * car1和car的引用比较：true
     * ==================================
     * 张小泉的出租车是所属于长生公司的
     * 出租车是提高市民生活质量的重要条件之一
     * taxi的信息是：张小泉拥有一辆蓝颜色的出租车
     * ==================================
     * 孙二娘拥有的紫颜色的私家车，有7个座位
     * 家用汽车大多有5个座位
     */
}
