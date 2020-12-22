package src._04string._3demo2;

import java.io.UnsupportedEncodingException;

/**
 * 标题: 字符串与byte数组间的相互转换
 *
 * @Author: Jiang
 * @Date: 2020/12/22 17:22
 */
public class StringDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = new String("JAVA 编程 基础");
        /**将字符串转换为byte数组,并打印输出*/
        byte[] arrs = str.getBytes();
        byte[] arrs1 = str.getBytes("GBK");
        for(int i = 0;i< arrs.length;i++){
            System.out.print(arrs[i] + " ");
        }
        System.out.println("******************************");
        /**将byte数组转换为字符串*/
        String str1 = new String(arrs); // 需要转换前后编码是一致的,默认utf-8
        System.out.println(str1);
        String str2 = new String(arrs,"GBK"); // 指定字符集,不一致会乱码
        String str3 = new String(arrs1,"GBK"); // 指定字符集,一致,会成功转换
        System.out.println(str2);
        System.out.println(str3);
    }
}
