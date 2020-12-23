package _05collection._1list._1demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 标题: List案例1
 *
 * @Author: Jiang
 * @Date: 2020/12/23 9:45
 */
public class ListDemo1 {
    /**
     * 用ArrayList存储编程语言的名称,并输出.
     * 名称包括"Java","C","C++","Go","Swift"
     */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("Swift");
        //输出列表中元素的个数
        System.out.println("列表中元素的个数为:"+list.size());
        System.out.println("**************************************");
        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println("**************************************");
        //移除列表中的"C++"
        //方式一,参数为索引
//        list.remove(2);
        //方式二,参数为元素,当参数在列表中没有时,则不改变原列表
        list.remove("C++");
        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println("**************************************");
    }
}
