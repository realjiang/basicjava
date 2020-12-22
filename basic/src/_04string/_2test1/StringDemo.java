package _04string._2test1;

/**
 * 标题: 字符串-编程练习1
 *
 * @Author: Jiang
 * @Date: 2020/12/22 17:09
 */
public class StringDemo {
    public static void main(String[] args) {
        /*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String str = "abcdefg";
        str = str.substring(2, 5).toUpperCase();
        str = str.replace("DE", "MM");
        System.out.println("结果为:"+str);
    }
}
