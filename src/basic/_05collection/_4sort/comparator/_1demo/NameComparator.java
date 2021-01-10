package _05collection._4sort.comparator._1demo;

import java.util.Comparator;

/**
 * 标题: 按名字排序-比较器
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:21
 */
public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        //按名字排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n1 = name1.compareTo(name2);//按名字升序
        int n2 = name2.compareTo(name1);//按名字降序
        return n1;
    }
}
