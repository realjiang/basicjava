package _05collection._3map._2test1;

import java.util.*;

/**
 * 标题: Map编程练习1
 *
 * @Author: Jiang
 * @Date: 2020/12/24 9:31
 */
public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map<String, String> champion = new HashMap<>();
        champion.put("2014", "德国");
        champion.put("2010", "西班牙");
        champion.put("2006", "意大利");
        //使用迭代器的方式遍历
        System.out.println("使用迭代器方式进行输出:");
        Iterator it = champion.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+"  ");
        }
        //使用EntrySet同时获取key和value
        System.out.println("");
        System.out.println("使用EntrySet方式进行输出:");
        Set<Map.Entry<String, String>> entries = champion.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
