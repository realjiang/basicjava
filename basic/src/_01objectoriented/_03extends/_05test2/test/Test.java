package _01objectoriented._03extends._05test2.test;

import _01objectoriented._03extends._05test2.info.Banana;
import _01objectoriented._03extends._05test2.info.Fruits;
import _01objectoriented._03extends._05test2.info.Waxberry;

/**
 * 标题: 测试类 - [继承] 编程练习3
 *
 * @Author: Jiang
 * @Date: 2020/12/7 17:09
 */
public class Test {
    public static void main(String[] args) {
        // 实例化2个父类对象，传入两组相同的参数值
        Fruits f1 = new Fruits("圆","甜");
        Fruits f2 = new Fruits("圆","甜");
        // 调用父类eat方法
        f1.eat();
        // 测试重写equals方法，判断两个对象是否相等
        Boolean flag = f1.equals(f2);
        System.out.println("frut1和frut2的引用比较:" + flag);
        System.out.println("————————————————————————————————————————");
        // 实例化子类对象，并传入相关参数值
        Waxberry waxberry = new Waxberry("圆形","酸甜适中","紫红色");
        // 调用子类face方法和eat方法
        waxberry.face();
        waxberry.eat();
        // 测试重写toString方法，输出子类对象的信息
        System.out.println(waxberry.toString());
        System.out.println("——————————————————————————————————————————————");
        // 实例化Banana类对象，并传入相关参数值
        Banana banana = new Banana("短而稍圆","果肉香甜","仙人蕉");
        // 调用子类的advantage和它的重载方法
        banana.advantage();
        banana.advantage("黄色");
    }
    /** 运行结果:
     * 水果可供人们食用!
     * frut1和frut2的引用比较:true
     * ————————————————————————————————————————
     * 杨梅:紫红色,圆形,果味酸甜适中。
     * 杨梅酸甜适中,非常好吃!
     * 杨梅的信息:果实为圆形,紫红色,酸甜适中,非常好吃!
     * ——————————————————————————————————————————————
     * 仙人蕉果形短而稍圆,果肉香甜,可供生食。
     * 仙人蕉颜色为黄色
     */
}
