package basic._04string._1demo1;

import java.io.UnsupportedEncodingException;

/**
 * 标题: 创建String对象的方法
 *
 * @Author: Jiang
 * @Date: 2020/12/22 15:35
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {

        /**
         * 方式一:"haha"是字符串常量,使用"haha"创建一个字符串对象,并赋值给字符串引用s1
         */
        String s1 = "haha";
        /**
         * 方式二:使用new关键字创建字符串对象,字符串的值为一个空串""
         */
        String s2 = new String();
        /**
         * 方式三:使用字符串常量"haha"创建对象,会先去常量池查看"haha"是否存在,如果存在就直接使用"haha"创建对象,
         * 如果不存在,就先在常量池中创建字符串"haha",然后再使用"haha"创建对象,赋值给字符串引用s3
         */
        String s3 = new String("haha");
        /**
         * 方式四:可以使用字符数组创建字符串,先定义一个字符数组,创建字符串对象时使用字符数组作为参数.
         */
        char[] ch = {'h', 'a', 'h', 'a'};
        String s4 = new String(ch);
        /**
         * 方式五:除了使用字符数组的所有元素创建字符串外,还可以使用字符数组的一部分创建字符串.
         * 这里的参数1和2的含义是:1标识从数组元素的第几位开始,2表示一共几个数组元素.
         * 从第一位开始也就是从a这个字符开始,2标识从a开始的两个字符,因此字符串s5的值为"ah".
         */
        char[] ch1 = {'h', 'a', 'h', 'a'};
        String s5 = new String(ch,1,2);
        /**
         * 方式六:可以利用字节数组生成字符串,与字符数组都在输入输出流部分应用较多,用于存储传输的二进制数据.
         * 从输出结果可以看出,实际上,这里的字节数组的元素是ascii码值,创建字符串对象后,就将他们转换为字符了.
         * 同样,也可以使用数组元素的一部分来创建字符串.
         */
        byte[] b = {54, 69, 70, 71, 72};
        String s6 = new String(b);
        String s7 = new String(b, 1, 2);
        System.out.println("s6="+s6); // s6=6EFGH
        System.out.println("s7="+s7); // s7=EF
        //使用字节数组时也可以指定字符集
        //但此时需要抛出异常UnsupportedEncodingException,该异常可能会因为编码格式写错而发生,
        //比如不小心将utf-8写成了uft-8
        byte[] b1 = {54, 69, 70, 71, 72};
        String s8 = new String(b,"utf-8");
        String s9 = new String(b, 1, 2,"utf-8");
    }
}
