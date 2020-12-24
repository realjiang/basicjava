package _05collection._4sort.comparable._1demo;

import _05collection._4sort.comparator._1demo.AgeComparator;
import _05collection._4sort.comparator._1demo.Cat;

import java.util.*;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/24 11:15
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods("s0001", "手机", 2000);
        Goods g2 = new Goods("s0002", "冰箱", 5000);
        Goods g3 = new Goods("s0003", "电视机", 3000);
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        //排序前
        System.out.println("按价格排序前:");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
        //排序 - 按价格进行降序排序
        Collections.sort(goodsList);
        //排序后
        System.out.println("按价格排序后:");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
    }
}
