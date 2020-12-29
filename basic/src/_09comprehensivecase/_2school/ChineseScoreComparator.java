package _09comprehensivecase._2school;

import java.util.Comparator;

/**
 * 标题: 语文成绩按平均分进行由大到小排序
 *
 * @Author: Jiang
 * @Date: 2020/12/28 17:11
 */
public class ChineseScoreComparator implements Comparator<Student> { //todo
    @Override
    public int compare(Student o1, Student o2) {
        //按名字升序排序
        float c1 = o1.getChinese();
        float c2 = o2.getChinese();
        return (int)(c1- c2);
    }
}
