package objectoriented._05polymorphism._05innerclass._02staticinnerclass;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:34
 */
public class PersonTest {
    public static void main(String[] args) {
        /**
         * 访问外部类
         */
        Person lili = new Person();
        lili.age = 12;
        /**
         *  2.获取静态内部类对象实例 :  new 外部类.内部类()
         */
        Person.Heart myHeart = new Person.Heart();
        System.out.println(myHeart.beat());
        /**
         * 访问内部类中的静态成员 :  外部类.内部类.成员属性/方法
         */
        Person.Heart.say();
        /**
         * 外部类和内部类中同名非静态方法
         */
        System.out.println("=======外部类和内部类中同名非静态方法========");
        myHeart.eat(); //访问内部类的
        new Person().eat();//访问外部类的
        lili.eat();//访问外部类的
        /**
         * 访问外部类静态成员
         */
        System.out.println(Person.num);
    }
}
