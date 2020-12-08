package objectoriented._03extends._04test1;

/**
 * 标题: [继承] - 测试重写toString
 *
 * @Author: Jiang
 * @Date: 2020/12/7 16:41
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("李明",18,"男");
        System.out.println(p);
        System.out.println(p.toString());
    }
}
