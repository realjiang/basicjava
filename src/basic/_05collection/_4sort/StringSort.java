package _05collection._4sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 标题: 字符串 - 排序
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:10
 */
public class StringSort {
    public static void main(String[] args) {
        //对存储在List中的整型数据进行排序
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("blue");
        list.add("yellow");
        list.add("grey");
        System.out.println("排序前:");
        for (String s : list) {
            System.out.print(s+"       ");
        }
        System.out.println();
        //对List中的数据进行排序
        Collections.sort(list);
        System.out.println("排序后:");
        for (String s : list) {
            System.out.print(s+"       ");
        }
    }
}
