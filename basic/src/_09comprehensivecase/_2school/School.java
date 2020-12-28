package src._09comprehensivecase._2school;

import java.util.Map;

/**
 * 学校类
 */
public class School {
    Map<String, Banji> schoolMap; //存放班级的集合
    //构造方法
    //getter和setter方法
    //添加班级：
     public void addBanji(Banji banji){}
    //删除班级 ：
     public void deleteBanji(Banji banji){}
    //通过班级名称查询班级：
     public Banji searchByName(String className) {return null;}
    //对各班语文成绩按平均分进行由大到小排序：
     public void sortChineseByAverage() {}
    //对各班数学成绩按平均分进行由大到小排序：
     public void sortMathByAverage() {}
    //显示所有班级名称：
     public void displayBanJiName() {}
}
