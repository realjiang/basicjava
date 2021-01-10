package _01objectoriented._05polymorphism._04interface._03test2;

/**
 * 标题: case2 - 多接口+父类 中 同名常量?
 *
 * @Author: Jiang
 * @Date: 2020/12/8 16:36
 */

interface One1{
    static  int x= 11;
}

interface Two1{
    final int x=22;
}

class Three1{
    public int x = 33;
}

public class TestTwo extends Three1 implements One1,Two1{
    public void test() {
        /**
         * 报错,编译器依然不知道选择哪一个(在默认方法那里用的那招,在常量这里不好用了)
         * Reference to 'x' is ambiguous, both 'Three1.x' and 'One1.x' match
         */
//        System.out.println(x);
        System.out.println(One1.x);
        System.out.println(Two1.x);
        System.out.println(new Three1().x);
    }
    public static void main(String[] args) {
        new TestTwo().test();
    }
}
