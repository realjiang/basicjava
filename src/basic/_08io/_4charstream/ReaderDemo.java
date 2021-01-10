package basic._08io._4charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 		字节输入输出流，主要用于读取和写入数据都是需要二进制格式的数据
 * 		字符输入输出流，用于读写字符串类型的数据
 * 		输入输出的编码不一致会乱码
 */
public class ReaderDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("basic//src//_08io//_3bytestream//file//imooc1.txt");//用字节流去文件中读取数据
			InputStreamReader isr=new InputStreamReader(fis,"GBK"); //字节字符转换流（输入），从字节输入流中读取数据转换成字符
			BufferedReader br=new BufferedReader(isr);//字符缓冲流（输入）
			FileOutputStream fos=new FileOutputStream("basic//src//_08io//_3bytestream//file//imooc2.txt");//字节输出流
			OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");//字节字符转换流（输出）
			//isr.getEncoding();//获取字符编码
			//osw.getEncoding();//获取字符编码
			BufferedWriter bw=new BufferedWriter(osw);//字符缓冲流（输出）
			int n=0;
			char[] cbuf=new char[10];//注意：这里是char类型的数组，不是byte类型数组了
//		    while((n=isr.read())!=-1){ //方法一：
//		    	   System.out.print((char)n);
//		    }

//			while((n=isr.read(cbuf))!=-1){ //方法二：
//				String s=new String(cbuf,0,n); //将读到的char数组字符串转换成字符串，n是实际读取到的大小，如果用cbuf，最后可能导致数据不对，和前面图片的例子类似
//				System.out.print(s);
//			}
			while((n=br.read(cbuf))!=-1){
				bw.write(cbuf, 0, n);
			}
			bw.flush();//这句也可以写到循环内
			fis.close();
			fos.close();
			isr.close();
			osw.close();
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
