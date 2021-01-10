package basic._03wrap._4test2;

/**
 * 标题: 包装类-编程练习2
 *
 * @Author: Jiang
 * @Date: 2020/12/22 9:56
 */
public class StringUse {
    public static void main(String[] args) {
        double a = 12.5;
        //将基本类型转换为字符串
        String str1 = Double.toString(a) + 10;
        System.out.println("a 转换为String型后+10的结果为： "+ str1);
        String str = "2.8";
        // 将字符串转换为基本类型
        //方式一
        double b1 = Double.parseDouble(str)+10;
        //方式二
        double b2 = Double.valueOf(str)+10;
        System.out.println("str 转换为double型后+10的结果为： "+ b1);
        System.out.println("str 转换为double型后+10的结果为： "+ b2);

    }
}
