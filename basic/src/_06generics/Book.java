package _06generics;

import java.util.List;

/**
 * 标题: 书
 *
 * @Author: Jiang
 * @Date: 2020/11/23 17:24
 */
public class Book {
    private String bookname;
    private String writer;
    private String press;
    private double prize;

    public Book() { // 无参构造器,new时才调用

    }
    public Book(String bookname, String writer, String press, double prize) { // 有参构造器
        this.bookname = bookname;
        this.writer = writer;
        this.setPress(press);
        this.setPrize(prize);
    }

    /**
     * 显示图书信息
     */
    public void introducebook() {
        System.out.println("书名:" + this.bookname);
        System.out.println("作者:" + this.writer);
        System.out.println("出版社:" + this.press);
        System.out.println("价格:" + this.prize + "元");
    }

    /**
     * 泛型成员方法 - 循环输出每个泛型类信息
     * @param list 集合
     * @param <T> 泛型
     */
    public <T> void show(List<T> list){
        for (T t : list) {
            System.out.println(t);
        }
    }

    public String getBookname() {
        return this.bookname;
    }

    public String getWriter() {
        return this.writer;
    }

    public String getPress() {
        return this.press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrize() {
        return this.prize;
    }

    public void setPrize(double prize) {
        if (prize<=10.0) {
            System.out.println("图书价格最低10元");
            this.prize = 10.0;
        }else {
            this.prize = prize;
        }
    }
}
