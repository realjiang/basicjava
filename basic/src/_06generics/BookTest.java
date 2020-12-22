package _06generics;

import java.util.ArrayList;

/**
 * 标题: 测试类——泛型
 *
 * @Author: Jiang
 * @Date: 2020/11/23 17:24
 */
public class BookTest {
    public static void main(String[] args) {
        /**测试泛型方法*/
        System.out.println("=========测试泛型方法================");
        Book b1 = new Book();
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        intList.add(111);
        intList.add(222);
        intList.add(333);
        b1.show(strList);
        b1.show(intList);
        /**测试泛型类*/
        System.out.println("=========测试泛型类================");
        Generics<String> g1 = new Generics<>();
        g1.setName("字符串");
        g1.setT("name");
        System.out.println("g1:" + g1);
        Generics<Integer> g2 = new Generics<>();
        g2.setName("Integer");
        g2.setT(1);
        System.out.println("g2:" + g2);
        /**测试泛型接口*/
        System.out.println("=========测试泛型接口================");
        Generics<String> gs = new Generics<>();
        gs.add("字符串");
        Generics<Integer> gi = new Generics<>();
        gi.del(1);
        Generics<Book> gc = new Generics<>();
        Book book = new Book();
        gc.update(book);
        Generics<Double> gd = new Generics<>();
        gd.select(1.1);
    }
}
