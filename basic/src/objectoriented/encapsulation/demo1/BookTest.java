package objectoriented.encapsulation.demo1;

/**
 * 标题: 测试类——封装
 *
 * @Author: Jiang
 * @Date: 2020/11/23 17:24
 */
public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("红楼梦","曹雪芹","人民文学出版社",10);
        Book b2 = new Book("小李飞刀","古龙","中国长安出版社",55.5);
        b1.introducebook();
        System.out.println("=========================================================");
        b2.introducebook();
    }
}
