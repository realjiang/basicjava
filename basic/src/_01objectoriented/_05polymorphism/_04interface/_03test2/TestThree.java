package _01objectoriented._05polymorphism._04interface._03test2;

/**
 * 标题: case3 - 解决办法
 *
 * @Author: Jiang
 * @Date: 2020/12/8 16:36
 */

interface One2{
    static  int x= 11;
}

interface Two2{
    final int x=22;
}

class Three2{
    public int x = 33;
}

public class TestThree extends Three2 implements One2,Two2{
    public int x = 44;
    public void test() {
        /**
         * 在子类定义一个独有的同名的成员,不报错了,结果是子类中定义的
         */
        System.out.println(x);
//        System.out.println(One2.x);
//        System.out.println(Two2.x);
//        System.out.println(new Three2().x);
    }
    public static void main(String[] args) {
        new TestThree().test();
    }
}
