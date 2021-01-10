package basic._09comprehensivecase._2school;

import java.util.Comparator;
import java.util.Map;

/**
 * 标题: 成绩按平均分进行由大到小排序
 *
 * @Author: Jiang
 * @Date: 2020/12/28 17:11
 */
public class ScoreComparator implements Comparator<Map.Entry<String,Float>> {
    @Override
    public int compare(Map.Entry<String,Float> o1, Map.Entry<String,Float> o2) {
        //按平均分从大到小排序
        return o2.getValue().compareTo(o1.getValue());
    }
}
