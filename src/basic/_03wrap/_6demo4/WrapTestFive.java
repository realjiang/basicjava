package basic._03wrap._6demo4;

/**
 * 标题: 包装类-其他注意点2
 *
 * @Author: Jiang
 * @Date: 2020/12/22 13:19
 */
public class WrapTestFive {
    Integer one;

    public static void main(String[] args) {
        WrapTestFive temp = new WrapTestFive();
        int two = 20;
        System.out.println(temp.one + two);
    }
    /** 运行报错:
     * Exception in thread "main" java.lang.NullPointerException
     * 	at objectoriented._07wrap._6demo4.WrapTestFive.main(WrapTestFive.java:15)
     */
}
