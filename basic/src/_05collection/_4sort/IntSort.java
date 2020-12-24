package _05collection._4sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 标题: 整型-排序
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:06
 */
public class IntSort {
    public static void main(String[] args) {
        //对存储在List中的整型数据进行排序
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        System.out.println("排序前:");
        for (int n : list) {
            System.out.print(n+"       ");
        }
        System.out.println();
        //对List中的数据进行排序
        Collections.sort(list);
        System.out.println("排序后:");
        for (int n : list) {
            System.out.print(n+"       ");
        }
    }
}
