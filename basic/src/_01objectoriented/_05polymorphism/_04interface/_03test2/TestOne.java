package _01objectoriented._05polymorphism._04interface._03test2;

/**
 * 标题: case1 - 多接口,同名常量?
 *
 * @Author: Jiang
 * @Date: 2020/12/8 16:36
 */

interface One{
    static  int x= 11;
}
interface Two{
    final int x=22;
}
class Three{
    public int x = 33;
}
public class TestOne implements One,Two{
    public void test() {
        /**
         * 报错,实现的两个接口中有同名的常量,编译器不知道该选哪一个了,要在调用时指明
         * Reference to 'x' is ambiguous, both 'One.x' and 'Two.x' match
         */
        //System.out.println(x);
        System.out.println(One.x);
        System.out.println(Two.x);
    }
    public static void main(String[] args) {
        new TestOne().test();
    }
}
