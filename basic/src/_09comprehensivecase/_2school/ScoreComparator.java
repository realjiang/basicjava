package src._09comprehensivecase._2school;

import java.util.Comparator;

/**
 * 标题: 成绩按平均分进行由大到小排序
 *
 * @Author: Jiang
 * @Date: 2020/12/28 17:11
 */
public class ScoreComparator implements Comparator<Float> { //todo
    @Override
    public int compare(Float o1, Float o2) {
        //按平均分从大到小排序
        return (int) (o2.floatValue()-o1.floatValue());
    }
}
