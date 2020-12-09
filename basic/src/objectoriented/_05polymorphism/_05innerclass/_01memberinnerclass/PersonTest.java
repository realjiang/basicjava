package objectoriented._05polymorphism._05innerclass._01memberinnerclass;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:34
 */
public class PersonTest {
    public static void main(String[] args) {
        //访问外部类
        Person lili = new Person();
        lili.age = 12;
        //获取内部类对象实例
        /**
         * 方式一:  new 外部类().new 内部类()
         */
        Person.Heart myHeart = new Person().new Heart();
        System.out.println(myHeart.beat());
        /**
         * 方式二:  外部类对象.new 内部类()
         */
        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());
        /**
         * 方式三:  通过外部类对象的获取内部类方法
         */
        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());
    }
}
