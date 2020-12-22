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
        //在执行该方法时,会提供一个缓存区(对象池),当-128<=参数<=127时,会在缓存区中找是否存在这样值的对象
        //如果有则直接产生,如果没有,则再实例化一个Integer对象
        System.out.println("three==four的结果:"+(three==four)); //3. true 在范围内,指向的是缓存区中同一块空间
        Integer five = 200; //自动装箱
        System.out.println("five==200的结果:"+(five==200)); //4.true 自动拆箱
        Integer six = 200; //自动装箱
        //相当于 Integer six = Integer.valueOf(200);
        //在执行该方法时,会提供一个缓存区(对象池),当参数超出-128~127的范围时,就直接隐式的实例化一个Integer对象了
        System.out.println("five==six的结果:"+(five==six)); //5. false 在范围外,指向的是缓存区中不同内存空间
        /**
         * 注意:
         * 8种基本类型中,除了float和double外,都可以应用对象常量池概念
         */
        Double d1 = Double.valueOf(100);
        System.out.println("d1==100的结果:"+d1);
        Double d2 = Double.valueOf(100);
        System.out.println("d1==d2的结果:"+(d1==d2)); //6.false double和float,不能应用缓存区(常量池)的概念
        System.out.println("************************************************");
        /**
         * 可以对Integer对象进行运算,相当于其对应的基本数据类型进行运算
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
    }
}
