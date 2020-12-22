package objectoriented._07wrap._6demo4;

/**
 * 标题: 包装类对象之间的比较
 *
 * @Author: Jiang
 * @Date: 2020/12/22 10:39
 */
public class WrapTestThree {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one==two的结果:"+(one==two)); //1.false 值相同,但指向的内存空间不同
        Integer three = 100; //自动装箱
        System.out.println("three==100的结果:"+(three==100)); //2.true 自动拆箱
        Integer four = 100; //自动装箱
        //相当于 Integer four = Integer.valueOf(100);
        //在执行该方法时,java会提供一个缓存区(对象池),当-128<=参数<=127时,会在缓存区中找是否存在这样值的对象
        //如果有则直接产生,如果没有,则再实例化一个Integer对象
        System.out.println("three==four的结果:"+(three==four)); //3. true 在范围内,指向的是缓存区中同一块空间
        Integer five = 200; //自动装箱
        System.out.println("five==200的结果:"+(five==200)); //4.true 自动拆箱
        Integer six = 200; //自动装箱
        //相当于 Integer six = Integer.valueOf(200);
        //在执行该方法时,会提供一个缓存区(对象池),当参数超出-128~127的范围时,就直接隐式的实例化一个Integer对象了
        System.out.println("five==six的结果:"+(five==six)); //5. false 在范围外,指向的是缓存区中不同内存空间
        //拆箱后的数据是基础数据类型.用==判断相等性,比较的都是数值,如果是字符,比较的是ascii值
        int a = new Integer(65);//手动拆箱
        int b = 65;
        char c = new Character('A');
        System.out.println(a==b);//true
        System.out.println(b==c);//true
        /**
         * 注意:
         * 8种基本类型中,除了float和double外,都可以应用对象常量池概念
         * Byte,Short,Integer,Long:缓存[-128,127]区间的数据
         * Character:缓存[0,127]区间的数据
         * Boolean:缓存true,false
         * Double,Float不支持!
         */
        Double d1 = Double.valueOf(100);
        System.out.println("d1==100的结果:"+d1);
        Double d2 = Double.valueOf(100);
        System.out.println("d1==d2的结果:"+(d1==d2)); //6.false double和float,不能应用缓存区(常量池)的概念
        System.out.println("************************************************");
        /**
         * 可以对包装类对象进行运算,相当于其对应的基本数据类型进行运算.
         * 当包装类正常实例化后,可以与基本数据类型进行运算操作;
         * 如果包装类对象未初始化,则不能直接进行运算.编译错误:...variable one may not have been initialized
         */
        Integer i = new Integer(1) + new Integer(2);
        switch (i) {
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("baby");
                break;
        }
        System.out.println("***************************************************");
        /**
         * 调用equals方法时,当类型相同,且数值相同时,返回true;反之返回false。
         * 当比对方为基本数据类型时,会先进行自动装箱操作,后进行比较。
         */
        Integer a1 = 12;
        int b1 = 12;
        System.out.println(a1.equals(b));//true

        Character c1 = 12;
        System.out.println(a1.equals(c));// false
        System.out.println("***************************************************");
        /**
         * 方法重载时,如重载方法的参数分别为进本数据类型与其对应包装类,原则是:各回各家,各找各妈~代码见WrapTestFour.java
         */
        System.out.println("***************************************************");
        /**
         * Integer对象作为类内成员属性,默认初始值为null,因此不会产生编译时错误;
         * 但当进行加法运算时,由于默认会调用intValue方法自动拆箱,因此会触发空指针异常.代码见WrapTestFive.java
         */
    }
}
