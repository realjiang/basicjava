package src._08io._3bytestream;

import java.io.*;

/**
 * 缓冲流 - 编程练习1
 */
public class BufferedTest1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos1 = new FileOutputStream("basic//src//_08io//_3bytestream//file//one.txt");
            System.out.println("one.txt不用缓冲流来写");
            long startTime1=System.currentTimeMillis();
            for (int i = 0; i < 100001; i++) {
                fos1.write('a');
            }
            fos1.flush();
            fos1.close();
            long endTime1=System.currentTimeMillis();
            System.out.println("用时为："+(endTime1-startTime1));

            System.out.println("two.txt用缓冲流来写");
            FileOutputStream fos2 = new FileOutputStream("basic//src//_08io//_3bytestream//file//two.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos2);
            long startTime2=System.currentTimeMillis();
            for (int i = 0; i < 100001; i++) {
                bos.write('a');
            }
            bos.flush();
            bos.close();
            long endTime2=System.currentTimeMillis();
            System.out.println("用时为："+(endTime2-startTime2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /** 运行结果（不唯一）：
     * one.txt不用缓冲流来写
     * 用时为：249
     * two.txt用缓冲流来写
     * 用时为：2
     */
}
