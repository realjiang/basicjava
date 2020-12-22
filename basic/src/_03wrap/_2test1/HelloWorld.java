package _03wrap._2test1;

/**
 * 标题: 包装类-编程练习1
 *
 * @Author: Jiang
 * @Date: 2020/12/22 9:39
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 定义int类型变量，值为100
        int score = 100;
        // 创建Integer包装类对象，表示变量score1的值
        Integer score1 = new Integer(score);
        // 将Integer包装类转换为double类型
        double score2 = score1.doubleValue();
        // 将Integer包装类转换为long类型
        long score3 = score1.longValue();
        // 将Integer包装类转换为int类型
        int score4 = score1.intValue();
        //打印输出
        System.out.println("score对应的Integer类型结果为:"+score1);
        System.out.println("score对应的double类型结果为:"+score2);
        System.out.println("score对应的long类型结果为:"+score3);
        System.out.println("重新由Integer转换为int类型结果为:"+score4);
    }
    /** 运行结果:
     * score对应的Integer类型结果为:100
     * score对应的double类型结果为:100.0
     * score对应的long类型结果为:100
     * 重新由Integer转换为int类型结果为:100
     */
}

