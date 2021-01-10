package basic._08io._5serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 将Goods类对象写入文件中，并读取出来
 */
public class GoodsTest {

	public static void main(String[] args) {
		// 定义Goods类的对象
		Goods goods1 = new Goods("gd001", "电脑", 3000);
		try {
			FileOutputStream fos = new FileOutputStream("basic//src//_08io//_3bytestream//file//imooc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);//字节输出流的子类
			FileInputStream fis = new FileInputStream("basic//src//_08io//_3bytestream//file//imooc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// 将Goods对象信息写入文件
			oos.writeObject(goods1); //写入一个对象
			oos.writeBoolean(true); //写入一个布尔类型的变量
			oos.flush();
			// 读对象信息
			try {
				Goods goods = (Goods) ois.readObject(); //返回值是Object类型，这里强转成Goods
				System.out.println(goods);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(ois.readBoolean());//读取布尔类型，要注意读写顺序要一致，否则可能会报EOF异常

			fos.close();
			oos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
