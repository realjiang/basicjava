package basic._05collection._2set._1demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 标题: Set案例1 - 处理字符串元素
 *
 * @Author: Jiang
 * @Date: 2020/12/23 12:40
 */
public class SetDemo1 {
    /**
     * 将英文单词添加到HashSet中
     */
    public static void main(String[] args) {
        Set set = new HashSet();
        //向集合添加内容
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        //显示集合内容- 通过迭代器接口
        System.out.println("集合中的元素为:");
        Iterator it = set.iterator();
        //遍历迭代器,并输出元素
        while (it.hasNext()) {
            System.out.print(it.next()+"    ");
        }
        System.out.println("");
        //在集合中插入一个新的单词
        //set.add("green");//无序,在哪插入都一样
        System.out.println("*************************************");
        //插入一个重复元素- 插入失败,但不会报错
        set.add("white");
        //显示集合内容- 通过迭代器接口
        System.out.println("插入重复元素后,集合中的元素为:");
        Iterator it1 = set.iterator();
        //遍历迭代器,并输出元素
        while (it1.hasNext()) {
            System.out.print(it1.next()+"    ");
        }
    }
}
