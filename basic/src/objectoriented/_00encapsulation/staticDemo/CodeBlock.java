package objectoriented._00encapsulation.staticDemo;

/**
 * 标题: 代码块
 *
 * @Author: Jiang yuting
 * @Date: 2020/11/27 15:17
 */
public class CodeBlock {
    public CodeBlock() {
        System.out.println("CodeBlock的构造方法");
    }

    {
        System.out.println("CodeBlock的构造块");
    }

    static {
        System.out.println("CodeBlock的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("CodeBlock的主方法");
        System.out.println("产生Code类实例对象");
        Code code = new Code();
        System.out.println("产生CodeBlock类实例对象");
        CodeBlock codeBlock = new CodeBlock();
    }

    /** 运行结果:
     * CodeBlock的静态代码块
     * CodeBlock的主方法
     * 产生Code类实例对象
     * Code的静态代码块
     * Code的构造块
     * Code的构造方法
     * 产生CodeBlock类实例对象
     * CodeBlock的构造块
     * CodeBlock的构造方法
     * */
}
