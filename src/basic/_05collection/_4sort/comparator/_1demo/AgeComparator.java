package _05collection._4sort.comparator._1demo;

import java.util.Comparator;

/**
 * 标题: 按年龄排序
 *
 * @Author: Jiang
 * @Date: 2020/12/24 13:41
 */
public class AgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        //按年龄排序
        int month1 = o1.getMonth();
        int month2 = o2.getMonth();
//        return month1-month2;//升序
        return month2-month1;//降序
    }
}
