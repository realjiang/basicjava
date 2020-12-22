package _03wrap._3demo2;

/**
 * 标题: 基本数据类型和字符串之间的转换
 *
 * @Author: Jiang
 * @Date: 2020/12/22 9:48
 */
public class WrapTestTwo {
    public static void main(String[] args) {
        /**基本数据类型转换为字符串*/
        int t1 = 2;
        String t2 = Integer.toString(t1);
        //测试
        System.out.println("int类型转换为String类型对象t2=" + t2);
        System.out.println("*********************************************");
        /**字符串转换为基本数据类型*/
        //方式1:包装类的parseXXX()方法
        int t3 = Integer.parseInt(t2);
        //方式二:包装类的valueOf()方法,先将字符串转换为包装类,再通过自动拆箱完成基本类型转换
        int t4 = Integer.valueOf(t2);
        //测试
        System.out.println("String类型转换为int类型对象t3=" + t3);
        System.out.println("String类型转换为int类型对象t4=" + t4);
    }
}
