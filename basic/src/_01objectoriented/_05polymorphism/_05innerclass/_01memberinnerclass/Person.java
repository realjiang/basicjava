package _01objectoriented._05polymorphism._05innerclass._01memberinnerclass;

/**
 * 标题: 成员内部类
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:33
 */

/**
 * 外部类
 */
public class Person {
    public int age;

    public Heart getHeart() {
        System.out.println(new Heart().test);
        //System.out.println(test);//报错,无法直接访问内部类成员
        return new Heart();
    }

    public void eat() {
        System.out.println("人会吃东西");
    }

    /**
     * 成员内部类:
     * 1.内部类在外部使用时,无法直接实例化,需要借由外部类信息才能完成实例化
     * 2.内部类的访问修饰符任意,但是访问范围会受影响
     * 3.内部类可以直接访问外部类的成员属性/方法,如果出现同名属性,优先访问内部类中定义的
     * 4.通过  外部类.this.成员  可以访问外部类中同名的信息
     * 5.外部类访问内部类信息,需要通过内部类实例,无法直接访问
     * 6.内部类编译后.class文件的命名规则 : 外部类$内部类.class
     * 7.内部类中是否可以包含与外部类相同方法签名的方法?——见静态内部类
     */
    class Heart{
        int test = 11;
        int age = 13;
//        public void eat() {....} 是否会报错?如果不报错,访问的是内部类的还是外部类的?
        public String beat() {
            eat();
            return age+"岁的心脏在跳动";
        }
    }
}
