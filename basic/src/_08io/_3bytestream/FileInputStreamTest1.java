package src._08io._3bytestream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节输入流 - 编程练习1
 * 老师让程序员小马统计英文演讲稿speech.txt文件中共有多少个字符，
 * 并显示所有内容以便在演讲开始前有个准备，假如你是小马，请完成老师教给你的任务
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileInputStream f = new FileInputStream("basic//src//_08io//_3bytestream//file//speech.txt");
            int n = 0;
            while ((n = f.read()) != -1) {
                count++;
            }
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("统计结果：speech.txt文件中共有"+count+"个字节");
    }
}
