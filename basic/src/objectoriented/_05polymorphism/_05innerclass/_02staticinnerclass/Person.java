package objectoriented._05polymorphism._05innerclass._02staticinnerclass;

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
    public static int num;//4.

    public Heart getHeart() {
        System.out.println(new Heart().test);
        //System.out.println(test);//报错,无法直接访问内部类成员
        return new Heart();
    }

    public void eat() {
        System.out.println("外部类eat方法:人会吃东西");
    }

    /**
     * 静态内部类:
     * 1.静态内部类中，只能直接访问外部类的静态成员属性/方法，如果需要调用非静态成员属性/方法，可以通过 对象实例. 访问
     * 2.静态内部类实例时,可以不依赖于外部类对象  Person.Heart myHeart = new Person.Heart();
     * 3.可以通过  外部类.内部类.静态成员 的方式,访问内部类中的静态成员  Person.Heart.say();
     * 4.
     *   4.1当内部类属性与外部类属性同名时,默认直接调用内部类中的成员;
     *   4.2如果需要访问外部类中的静态属性,则可以通过  外部类.属性  的方式;  Person.num
     *   4.3如果需要访问外部类中的非静态属性,则可以通过  new 外部类().属性  的方式;  new Person().age
     */
    public static class Heart{
        public static int age = 13;
        int test = 11;

        public static void say() {
            System.out.println("hello");
        }
//        public void eat() {....} 上节疑问:是否会报错?如果不报错,访问的是内部类的还是外部类的?
        public void eat() {
            System.out.println("内部类eat方法");
        }//4.1 答:不会报错,默认访问的是内部类的
        public String beat() {
            eat();//4.1 不报错,默认访问的是内部类的
//            new Person().eat();//1.不报错 4.3 访问的是外部类的
//            return Person.this.age+"岁的心脏在跳动";// 1.报错 不能在静态上下文环境中使用this
//            return new Person().age+"岁的心脏在跳动";//1.不报错 4.3
            return Person.num+"岁的心脏在跳动";//4.2不报错
        }
    }
}
