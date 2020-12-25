package src._06generics._4demo3;

/**
 * 自定义泛型方法
 */
public class GenericMethod {
    //泛型方法不一定要定义在泛型类中
    //<T>必须写在访问修饰符和返回值之间
    public <T> void PrintValue(T t) {
        System.out.println(t);
    }
//    public <T extends Number> void PrintValue(T t) { //只能输入Number和Number子类的参数
//        System.out.println(t);
//    }
    //test
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.PrintValue("hello");
        gm.PrintValue(1);
        gm.PrintValue(5.0f);
    }
}
