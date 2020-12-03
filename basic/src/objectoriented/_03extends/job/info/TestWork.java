package objectoriented._03extends.job.info;

/**
 * 标题: 测试工作
 *
 * @Author: Jiang
 * @Date: 2020/12/3 16:56
 */
public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int testnum;
    private int bugnum;
    //编写构造方法，并调用父类相关赋值方法，完成属性赋值

    public TestWork(int testnum, int bugnum) {
        this.setTestnum(testnum);
        this.setBugnum(bugnum);
        this.setName("测试工作");
    }

    //公有的get***/set***方法完成属性封装
    public int getTestnum() {
        return testnum;
    }
    public void setTestnum(int testnum) {
        this.testnum = testnum;
    }
    public int getBugnum() {
        return bugnum;
    }
    public void setBugnum(int bugnum) {
        this.bugnum = bugnum;
    }
    //重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
    public String work() {
        String info = this.getName() + "的日报是:今天编写了" + this.getTestnum() + "个测试用例,发现了" + this.getBugnum() + "个bug。";
        return info;
    }
}
