package basic._08io._2path;

import java.io.File;
import java.io.IOException;

/**
 * 绝对路径和相对路径
 *
 * 相对路径比较常用！
 * 第一种情况：
 * java
 *  - a.txt
 *  - b.txt
 *  a和b在相同目录，对于a文件来说，b的相对路径就是   b.txt
 *  第二种情况
 *  java
 *  - a.txt
 *  - java2
 *  	- b.txt
 *  b在与a同级的目录java2里面，对于a文件来说，b的相对路径就是   java2//b.txt
 *  第三种情况
 *  -java1
 *  	- java2
 *  		- a.txt
 *  	- java3
 *      	- b.txt
 *  b在与a的父级目录java2同级的目录java3里面，对于a文件来说，b的相对路径就是   ..//java3//b.txt
 */
public class FileDemo {

	public static void main(String[] args) {
//		File f=new File("c:\\imooc\\java\\thread\\thread.txt");
//		System.out.println(f.exists());
		File f=new File("thread.txt");//在工程目录下
		try {
			f.createNewFile();
			//是否是绝对路径
			System.out.println(f.isAbsolute());
			//获取相对路径
			System.out.println(f.getPath());
			//获取绝对路径
			System.out.println(f.getAbsolutePath());
			//获取文件名
			System.out.println(f.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
