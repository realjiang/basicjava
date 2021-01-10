package basic._08io._3bytestream;

/**
 * 字节输入流-1
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

	public static void main(String[] args) {
		//创建一个FileInputStream对象
		try {
			FileInputStream fis=new FileInputStream("basic//src//_08io//_3bytestream//file//imooc0.txt");
//			int n=fis.read(); //读取一个数据字节，需要捕获异常IOException
//			System.out.print((char)n);
			int n=0;
//			while(n!=-1){ //read方法返回值是-1表示读取到文件末尾了
//				System.out.print((char)n);
//				n=fis.read();//没有这句会死循环
//			}
			while((n=fis.read())!=-1){ //上面方法的简写
				System.out.print((char)n);
			}
			
			fis.close();//不要忘记关闭输入流
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){ //IOException要写在FileNotFoundException后，因为FileNotFoundException是IOException子类
			e.printStackTrace();
		}
	}

}
