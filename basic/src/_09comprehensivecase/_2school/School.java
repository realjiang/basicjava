package src._09comprehensivecase._2school;

import java.util.*;

/**
 * 学校类
 */
public class School {
    Map<String, Banji> schoolMap; //存放班级的集合

    /**
     * 构造方法
     */
    public School() {
        schoolMap = new HashMap<>();
    }

    /**
     * getter和setter方法
     * @return 返回值
     */
    public Map<String, Banji> getSchoolMap() {
        return schoolMap;
    }

    public void setSchoolMap(Map<String, Banji> schoolMap) {
        this.schoolMap = schoolMap;
    }

    /**
     * 添加班级
     * @param banji 班级对象
     */
     public void addBanji(Banji banji){
         //班级列表名称作为key,map自带不可重复功能放
         schoolMap.put(banji.getClassId(), banji);
         System.out.println("添加成功");
     }

    /**
     * 删除班级
     * @param banji 班级对象
     */
     public void deleteBanji(Banji banji){
         if (schoolMap.get(banji.getClassId()) == null) {
             System.out.println("未找到Id为" + banji.getClassId() + "的班级，删除失败！");
         } else if (banji.getClassName().equals("主班级列表")) {
             System.out.println("主班级列表不能删除！");
         } else {
             //在业务代码中判断是否为空
             schoolMap.remove(banji.getClassId());
             System.out.println("删除成功！");
         }
     }

    /**
     * 通过班级名称查询班级
     * @param className 班级名字
     * @return 班级对象
     */
     public Banji searchByName(String className) {
         //装返回值 Banji对象
         Banji banji = null;
         //获取学校中所有班级对象
         Collection<Banji> values = schoolMap.values();
         //便利查找，若找到名字相同的，赋值给banji对象
         for (Banji bj:values) {
             if (bj.getClassName().equals(className)) {
                 banji = bj;break;
             }
         }
         return banji;
     }

    /**
     * 对各班语文成绩按平均分进行由大到小排序
     */
     public void sortChineseByAverage() { //todo 逻辑需完善，要打印出平均分所在班级
         //各班班级名称+语文平均分集合 map
//         Map<String, Object> scoreList = new HashMap<>();
         //各班级语文平均分集合
         List<Float> avrList = new ArrayList<>();
         //尚未添加学生的班级数
         int noStuNum = 0;
         //得到各班级集合
         Collection<Banji> values = schoolMap.values();
         //计算各班级语文平均分，装入arvList
         for (Banji banji : values) {
             //当前班级学生集合
             List<Student> stuList = banji.getStuList();
             //各班语文成绩总分数
             float totalScore = 0;
             //判断班级中是否有学生
             if (stuList.size() <= 0) { //班级没有学生，给出提示，noStuNum+1
                 noStuNum++;
                 System.out.println(banji.getClassName()+"中尚未添加学生，不参与计算");continue;
             } else {//否则计算学生成绩总分，平均分
                 for (Student student : stuList) {
                     totalScore = totalScore + student.getChinese();
                 }
                 float avr = totalScore / stuList.size();
                 avrList.add(avr);
//                 scoreList.put(banji.getClassName(), avr);
             }
         }
         if (values.size()==noStuNum){ //如果所有班级都没有学生，提示添加学生
             System.out.println("所有班级尚无学生信息，请添加学生信息");
         } else { //否则返回平均分
             //集合排序
             Collections.sort(avrList,new ScoreComparator());
             //打印
             System.out.println("各班级语文平均分从大到小排序为：");
             for (int i = 0; i < avrList.size(); i++) {
                 System.out.println(avrList.get(i));
             }
         }
     }

    /**
     * 对各班数学成绩按平均分进行由大到小排序
     */
     public void sortMathByAverage() {
         //各班级数学平均分集合
         List<Float> avrList = new ArrayList<>();
         //尚未添加学生的班级数
         int noStuNum = 0;
         //得到各班级集合
         Collection<Banji> values = schoolMap.values();
         //计算各班级数学平均分，装入arvList
         for (Banji banji : values) {
             List<Student> stuList = banji.getStuList();
             //各班数学成绩总分数
             float totalScore = 0;
             //判断班级中是否有学生
             if (stuList.size() <= 0) {//班级没有学生，给出提示，noStuNum+1
                 noStuNum++;
                 System.out.println(banji.getClassName()+"中尚未添加学生，不参与计算");continue;
             } else {//否则计算学生成绩总分，平均分
                 for (Student student : stuList) {
                     totalScore = totalScore + student.getMath();
                 }
                 float avr = totalScore / stuList.size();
                 avrList.add(avr);
             }
         }
         if (values.size()==noStuNum){ //如果所有班级都没有学生，提示添加学生
             System.out.println("所有班级尚无学生信息，请添加学生信息");
         } else { //否则返回平均分
             //集合排序
             Collections.sort(avrList,new ScoreComparator());
             //打印
             System.out.println("各班级数学平均分从大到小排序为：");
             for (int i = 0; i < avrList.size(); i++) {
                 System.out.println(avrList.get(i));
             }
         }
     }

    /**
     * 显示所有班级名称
     */
     public void displayBanJiName() {
         //获取学校中所有班级对象
         Collection<Banji> values = schoolMap.values();
         //便利,打印班级名称
         System.out.println("所有班级名称列表：");
         for (Banji bj:values) {
             System.out.println(bj.getClassName());
         }
     }
}
