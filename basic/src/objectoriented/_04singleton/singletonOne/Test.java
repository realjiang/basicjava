package objectoriented._04singleton.singletonOne;

/**
 * 饿汉式-测试类
 */
public class Test {
    public static void main(String[] args) {
        //SingletonOne s = new SingletonOne();//报错，因为构造方法以及私有化了，不能在类外调用了。
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        //两个对象的引用相同，说明该类只能产生一个实例
    }
}
