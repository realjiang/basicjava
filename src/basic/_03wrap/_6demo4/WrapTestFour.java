package basic._03wrap._6demo4;

/**
 * 标题: 包装类-其他注意点1
 *
 * @Author: Jiang
 * @Date: 2020/12/22 13:07
 */
public class WrapTestFour {
    public static void main(String[] args) {
        testAge(new Integer(1));
    }

    private static void testAge(Integer i) {
        System.out.println("我是包装类做参数的方法");
    }

    private static void testAge(int i) {
        System.out.println("我是基本数据类型做参数的方法");
    }
}
