package _04string._1demo1;

/**
 * 标题: String的常用方法
 *
 * @Author: Jiang
 * @Date: 2020/12/22 15:44
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //定义一个字符串: "JAVA 编程 基础"
        String str = "JAVA 编程 基础";
        /**
         * length()
         * 语法:str.length();
         */
        System.out.println("字符串的长度是:"+str.length());
        /**
         * charAt()
         * 语法:str.charAt(索引);
         */
        //取出并输出字符"程"
        System.out.println(str.charAt(6));
        /**
         * substring()
         * 语法:
         * 1.str.substring(开始索引); 即"编"字符的索引
         * 2.str.substring(开始索引,结束索引) 结束索引->"础"字符的索引+1
         */
        //取出子串"编程 基础"并输出
        System.out.println(str.substring(5));
        //取出子串"编程"并输出
        System.out.println(str.substring(5,7));
        System.out.println("*******************************************************");
        String str1 = new String("JAVA编程基础,我喜欢java编程");
        /**
         * indexOf() 求字符或子串在字符串中第一次出现的位置
         * 语法:
         * 1.str.indexOf(字符)
         * 2.str.indexOf(字符串)
         * 3.str.indexOf(字符,开始索引)
         * 4.str.indexOf(字符串,开始索引)
         */
        System.out.println("字符'A'在字符串中第一次出现的位置:"+str1.indexOf('A'));
        System.out.println("子串\"编程\"在字符串中第一次出现的位置:"+str1.indexOf("编程"));
        System.out.println("字符'A'在字符串从索引8开始,第一次出现的位置:"+str1.indexOf('A',8));
        System.out.println("子串\"编程\"在字符串从索引8开始,第一次出现的位置:"+str1.indexOf("编程",8));

        /**
         * lastIndexOf() 求字符或子串在字符串中最后一次出现的位置
         * 语法:
         * 1.str.lastIndexOf(字符)
         * 2.str.lastIndexOf(字符串)
         * 3.str.lastIndexOf(字符,开始索引) 从开始索引往左查找
         * 4.str.lastIndexOf(字符串,开始索引) 从开始索引往左查找
         */
        System.out.println("字符'A'在字符串中,从结尾向左查找第一次出现的位置:"+str1.lastIndexOf('A'));
        System.out.println("子串\"编程\"在字符串中,从结尾向左查找第一次出现的位置:"+str1.lastIndexOf("编程"));
        System.out.println("字符'A'在字符串从索引8开始,向左查找第一次出现的位置:"+str1.lastIndexOf('A',8));
        System.out.println("子串\"编程\"在字符串从索引8开始,向左查找第一次出现的位置:"+str1.lastIndexOf("编程",8));
    }
}
