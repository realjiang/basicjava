package _01objectoriented._05polymorphism._05innerclass._03methodinnerclass;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:34
 */
public class PersonTest {
    public static void main(String[] args) {
        //访问外部类
        Person lili = new Person();
        lili.age = 12;
        //获取方法内部类实例
        //lili.getHeart();//3.1
        System.out.println(lili.getHeart());//3.2
    }
}
