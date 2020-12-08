package objectoriented._03extends._02job.test;

import objectoriented._03extends._02job.info.DevelopmentWork;
import objectoriented._03extends._02job.info.TestWork;
import objectoriented._03extends._02job.info.Work;

/**
 * 标题: 测试类 - [继承]编程练习1
 *
 * @Author: Jiang
 * @Date: 2020/12/3 16:58
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("父类信息测试：");
        Work work = new Work();
        System.out.println(work.work());
        System.out.print("测试工作类信息测试：");
        TestWork tw = new TestWork(10, 5);
        System.out.println(tw.work());
        System.out.print("研发工作类信息测试：");
        DevelopmentWork dw = new DevelopmentWork(1000, 10);
        System.out.println(dw.work());
    }
    /** 运行结果:
     * 父类信息测试：开心工作
     * 测试工作类信息测试：测试工作的日报是:今天编写了10个测试用例,发现了5个bug。
     * 研发工作类信息测试：研发工作的日报是:今天编写了1000行代码,目前仍然有10个bug没有解决。
     */
}
