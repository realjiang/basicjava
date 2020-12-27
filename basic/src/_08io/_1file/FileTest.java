package src._08io._1file;

import java.io.File;
import java.io.IOException;

/**
 * File类-编程练习1
 * 创建一个File类对象，判断指定文件或目录是否存在，若存在判断其是文件还是目录，是否可读、可写。
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("//Users//superj//Documents//project//iotest//File//Monday.docx");
        if(!f1.exists()) {
            try {
                f1.createNewFile();
                System.out.println("创建文件成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件名称："+f1.getName());
        System.out.println("文件上一级目录:"+f1.getParent());
        if (f1.isDirectory()) {
            System.out.println("文件/目录：这是一个目录");
        } else if(f1.isFile()) {
            System.out.println("文件/目录：这是一个文件");
        } else {
            System.out.println("文件/目录：这不是目录也不是文件");
        }
        if (f1.canRead() && f1.canWrite()) {
            System.out.println("读写性：这个文件既可以读还可以写");
        }else if(f1.canWrite()) {
            System.out.println("读写性：这个文件可写");
        } else if (f1.canRead()) {
            System.out.println("读写性：这个文件可读");
        } else {
            System.out.println("读写性：这个文件不可读不可写");
        }
    }
}
