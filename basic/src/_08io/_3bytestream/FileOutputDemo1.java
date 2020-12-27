package src._08io._3bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流-2 文件拷贝
 */
public class FileOutputDemo1 {

	public static void main(String[] args) {
		// 文件拷贝
		try {
			//先读取字节流
			FileInputStream fis=new FileInputStream("basic//src//_08io//_3bytestream//file//happy.jpg");
			//将读取的字节流，写入一个新的字节流
			FileOutputStream fos=new FileOutputStream("basic//src//_08io//_3bytestream//file//happycopy.jpg");
			int n=0;
			byte[] b=new byte[1024];
			while((n=fis.read(b))!=-1){
				//fos.write(b);//方式一
				fos.write(b,0,n);//方式二
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		/**
		 * 关于拷贝图片的大小：
		 * 方式一：拷贝后的图片会比原理大一点，这是因为
		 * 拷贝的过程中是读一点写一点，一开始每次都会读满1024个字节
		 * 最后一次读取时，可能就不到1024字节，这时再读取一次，就会多出一部分
		 * 通俗的说：假设，图片大小是1028字节，第一次读取了1024字节，第二次又读取了1024字节，
		 * 这样就多读了1020个字节
		 * 方式二：
		 * n不等于-1的时候，表示的是实际读取到字节数组b中的字节数
		 * 前几次读取字节正好是满的，也就是1024
		 * 最后一次读的时候刚好读取的就是实际读取到的字节，
		 * 这样就能大小保持一致了
		 * 通俗的说：假设，图片大小是1028字节，第一次读取了1024字节，第二次只读取实际读到的4字节，
		 * 这样就不会多了
		 */

	}

}
