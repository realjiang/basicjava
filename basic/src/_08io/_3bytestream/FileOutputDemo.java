package src._08io._3bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream("basic//src//_08io//_3bytestream//file//imooc0.txt",true);
			fis=new FileInputStream("basic//src//_08io//_3bytestream//file//imooc0.txt");
			fos.write(50); //存入50，可文件中读出来但是a，但是read方法读出来的是50，这是编码的问题
			fos.write('a');
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			fos.close();
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
