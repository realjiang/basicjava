package src._08io._3bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节输入流-2
 */
public class FileInputDemo2 {

	public static void main(String[] args) {
		// 创建一个FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream("basic//src//_08io//_3bytestream//file//imooc0.txt");
			byte[] b=new byte[100];
//			fis.read(b);//读取全部存入b，最长不超过b的长度
			fis.read(b,0,5); //读取b数组，从第0个索引开始，读5个，存入b
			System.out.println(new String(b));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
