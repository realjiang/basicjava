package objectoriented._05polymorphism._05innerclass._03methodinnerclass;

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
    public static int age;

    public Object getHeart() {
        /**
         * 方法内部类:
         * 1.定义在外部类方法中的内部类,也称局部内部类,作用范围在方法内
         * 2.和方法内部成员使用规则一样,class前面不可以添加public,private,protected,static
         * 3.方法内部类不能直接获取,要通过外部类的get方法中实例化 lili.getHeart();
         *      3.1 但这种方式实例化后,不能获取到内部类中的成员(方法中的属性/方法 属于局部的 只在方法内有效)
         *      3.2 因此外部类的get方法一般不直接返回方法内部类实例,而是返回方法内部类实例的属性/方法
         * 4.class文件命名: 外部类$序号内部类.class   Person$1Heart.class
         * 5.类中不能包含静态成员
         * 6.类中可以包含final,abstract修饰的成员
         */
         class Heart{
            //public static int age = 13;//报错,方法内部类中,不能有静态成员
            public  int age = 13;
            int temp = 22;

//            public static void say() { System.out.println("hello"); } //报错,方法内部类中,不能有静态成员
            public void say() { System.out.println("hello"); }

             public void eat() {

             }
            public String beat() {
                new Person().eat();
                return Person.age+"岁的心脏在跳动";
            }
        }
        //return new Heart();//3.1 一般不会直接返回方法内部类实例
        return new Heart().beat();//3.2 而是返回方法内部类的方法or属性
    }

    public void eat() {

    }

}
