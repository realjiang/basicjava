package _01objectoriented._03extends._02job.info;

/**
 * 标题: 研发工作
 *
 * @Author: Jiang
 * @Date: 2020/12/3 16:57
 */
public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
    private int lines;
    private int bugsnotfixed;
    //编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public DevelopmentWork(int lines,int bugsnotfixed) {
        this.setLines(lines);
        this.setBugsnotfixed(bugsnotfixed);
        this.setName("研发工作");
    }

    // 公有的get***/set***方法完成属性封装
    public int getLines() {
        return lines;
    }
    public void setLines(int lines) {
        this.lines = lines;
    }
    public int getBugsnotfixed() {
        return bugsnotfixed;
    }
    public void setBugsnotfixed(int bugsnotfixed) {
        this.bugsnotfixed = bugsnotfixed;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
    public String work() {
        String info = this.getName() + "的日报是:今天编写了" + this.getLines() + "行代码,目前仍然有" + this.getBugsnotfixed() + "个bug没有解决。";
        return info;
    }
}
