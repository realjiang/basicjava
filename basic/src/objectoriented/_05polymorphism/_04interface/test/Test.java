package objectoriented._05polymorphism._04interface.test;

import objectoriented._05polymorphism._04interface.info.*;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:10
 */
public class Test {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.game();
        phone.network();
        phone.photo();
        System.out.println("=============================");
        //当采用接口指向实现类的时候,这个对象ip只能调用接口中有的方法,不能调用实现类中特有方法
        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
        System.out.println("=============================");
        System.out.println(INet.TEMP);
//        INet.TEMP = 1;//报错,常量不能被修改
        System.out.println("-----------------------------------");
        INet net = new SmartWatch();
        System.out.println(net.TEMP);
        System.out.println("===============如果实现类里有跟接口同名的常量==============");
        INet net1 = new SmartWatch();
        System.out.println(net1.TEMP);//如果是接口指向实现类实例,则依然是接口中自己定义的常量信息
        System.out.println("-----------------------------------");
        SmartWatch sw = new SmartWatch();
        System.out.println(sw.TEMP);//如果是实现类的实例,则是实现类中定义的常量
    }
}
