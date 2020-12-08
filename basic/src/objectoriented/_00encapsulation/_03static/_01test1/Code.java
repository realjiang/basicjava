package objectoriented._00encapsulation._03static._01test1;

/**
 * 标题: 代码块
 *
 * @Author: Jiang yuting
 * @Date: 2020/11/27 15:17
 */
public class Code {

    public Code() {
        System.out.println("Code的构造方法");
    }

    {
        System.out.println("Code的构造块");
    }

    static {
        System.out.println("Code的静态代码块");
    }
}