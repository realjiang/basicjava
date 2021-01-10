package _01objectoriented._04singleton.singletonOneTest;

/**
 * 饿汉式 - 练习
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("第一个地球创建中。。。。");
        Earth one = Earth.getInstance();
        System.out.println("第二个地球创建中。。。。");
        Earth two = Earth.getInstance();
        System.out.println("第三个地球创建中。。。。");
        Earth three = Earth.getInstance();
        System.out.println("问：三个地球是同一个么？");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
    /** 运行结果：
     * 第一个地球创建中。。。。
     * 地球诞生
     * 第二个地球创建中。。。。
     * 第三个地球创建中。。。。
     * 问：三个地球是同一个么？
     * src.objectoriented._04singleton.singletonOneTest.Earth@61bbe9ba
     * src.objectoriented._04singleton.singletonOneTest.Earth@61bbe9ba
     * src.objectoriented._04singleton.singletonOneTest.Earth@61bbe9ba
     */
}
