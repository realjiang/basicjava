package src.objectoriented._04singleton.singletonTwo;

import src.objectoriented._04singleton.singletonOne.SingletonOne;

public class Test {
    public static void main(String[] args) {
//        SingletonTwo s = new SingletonTwo();//报错，因为构造方法以及私有化了，不能在类外调用了。
        SingletonTwo one = SingletonTwo.getInstance();
        SingletonTwo two = SingletonTwo.getInstance();
        System.out.println(one);
        System.out.println(two);
        //两个对象的引用相同，说明该类只能产生一个实例
    }
}
