package _09comprehensivecase._1player;

import java.util.Comparator;

/**
 * 标题: 按名称排序
 *
 * @Author: Jiang
 * @Date: 2020/12/28 17:11
 */
public class NameComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        //按名字升序排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2);
        return n;
    }
}
