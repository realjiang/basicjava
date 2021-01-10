package basic._04string._3demo2;

/**
 * 标题: == 和 equals的区别
 *
 * @Author: Jiang
 * @Date: 2020/12/22 17:33
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str1 = "hello"; //存入常量池
        String str2 = "hello";
        String str3 = new String("hello"); //存入堆
        System.out.println("str1和str2的内容相同?"+(str1.equals(str2)));
        System.out.println("str1和str3的内容相同?"+(str1.equals(str3)));
        System.out.println("str1和str2的地址相同?"+(str1==str2));
        System.out.println("str1和str3的地址相同?"+(str1==str3));
        System.out.println("***********************************************");
        /**
         * compareTo()
         * 语法:
         * 1. int compareTo(Object o) 字符串与对象进行比较
         * 2. int compareTo(String anotherString) 按字典顺序比较两个字符串
         * 参数:
         *  o -- 要比较的对象
         *  anotherString -- 要比较的字符串
         * 返回值:
         * 返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的差值;
         * 如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。
         * 如果参数字符串等于此字符串，则返回值 0；
         * 如果此字符串小于字符串参数，则返回一个小于 0 的值；
         * 如果此字符串大于字符串参数，则返回一个大于 0 的值。
         */
        String s1 = "Strings";
        String s2 = "Strings";
        String s3 = "Strings123";
        int result = s1.compareTo(s2);//0
        System.out.println(result);
        result = s2.compareTo( s3 );//-3
        System.out.println(result);
        result = s3.compareTo( s1 );//3
        System.out.println(result);
        String s4 = "abc";
        String s5 = "cd";
        result = s4.compareTo(s5); //a的ascii < c的ascii,停止比较,返回a的ascii-c的ascii
        System.out.println(result);
    }
}
