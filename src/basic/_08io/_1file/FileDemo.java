package basic._08io._1file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		//创建File对象
		//File file1=new File("c:\\imooc\\io\\score.txt"); //   方式一   windows：\反义字符，\\在字符串中表示一个\ 。linux：/
		//File file1=new File("c:\\imooc","io\\score.txt");// 方式二     参数一 ：路径  参数二：参数一子字路径
		File file=new File("c:\\imooc");
		File file1=new File(file,"io\\score.txt"); //方式三   通过已有file对象，创建另外一个file对象
		//判断是文件还是目录，得目录or文件存在才能判断，否则一律返回false
		System.out.println("是否是目录"+file1.isDirectory());
		System.out.println("是否是文件"+file1.isFile());
		//创建目录
		File file2=new File("c:\\imooc\\set\\HashSet");
		if(!file2.exists()) { //目录不存在时再创建
			file2.mkdirs(); //创建多级目录
		}
		//创建文件
		if(!file1.exists()) {
			try {
				file1.createNewFile();//创建文件时需要捕获异常
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
