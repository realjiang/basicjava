package basic._08io._4charstream;

import java.io.*;

/**
 * 字符流 - 编程练习1
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Test t = new Test();
        t.transWriteByBuff();//写
        t.transReadByBuff();//读
    }

    /**
     * 写
     */
    public void transWriteByBuff() throws IOException {
        FileOutputStream fos = new FileOutputStream("basic//src//_08io//_3bytestream//file//test1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("你好吗？\n我很好！");
        bw.flush();
        bw.close();
    }

    /**
     * 读
     */
    public void transReadByBuff() throws IOException {
        FileInputStream fis = new FileInputStream("basic//src//_08io//_3bytestream//file//test1.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());//一次读取一行
        System.out.println(br.readLine());
        br.close();
    }
    /** 运行结果：
     * 你好吗？
     * 我很好！
     */
}
