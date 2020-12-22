package _03wrap._5demo3;

/**
 * 标题: 包装类对象的初始值 - null
 *
 * @Author: Jiang
 * @Date: 2020/12/22 10:23
 */
public class CatTest {
    public static void main(String[] args) {
        //实例化对象
        Cat one = new Cat();
        //测试输出
        System.out.println("小猫的昵称:"+one.name); // null
        System.out.println("小猫的年龄month(int):"+one.month); // 0
        System.out.println("小猫的体重:"+one.weight);// 0.0
        System.out.println("小猫的年龄age(Integer):"+one.age);// null
    }
}
