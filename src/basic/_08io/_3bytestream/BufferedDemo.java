package basic._08io._3bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 		字节流操作的是硬盘，存取效率低
 * 		缓冲流操作的是内存，存取效率高；缓存输入流不能直接读取文件，要和文件输入/输出流结合
 */
public class BufferedDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("basic//src//_08io//_3bytestream//file//imooc0.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			FileInputStream fis=new FileInputStream("basic//src//_08io//_3bytestream//file//imooc0.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			long startTime=System.currentTimeMillis();
			bos.write(50);
			bos.write('a');
			bos.flush();
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			long endTime=System.currentTimeMillis();
			System.out.println(endTime-startTime);
			fos.close();
			bos.close();
			fis.close();
			bis.close();
			/**
			 * close和flush方法都不调用时，缓冲区未满是不会自动调用写操作的
			 * 当使用了close和flush的任一个，都会强制清空缓冲区中剩余的内容，执行写操作
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
