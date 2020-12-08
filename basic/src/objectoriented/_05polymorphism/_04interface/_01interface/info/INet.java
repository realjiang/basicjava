package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:17
 */
//接口访问修饰符:public 或 默认
public interface INet {
    /**
     * 接口中可以包含常量,默认会加上public static final
     * 接口中定义的常量在定义时必须初始化
     */
    int TEMP = 20;
    /**
     * 接口不能直接实例化,只能被某个类实现,将接口的引用指向具体的实现类
     * 接口中抽象方法,可以不写abstract关键字
     * public也可以不写,默认就是public
     * 当实现接口时,需要实现接口中的所有抽象方法,否则该类就也要设置为抽象类
     */
    public void network();

    /**
     * 如果希望更多的接口扩展方法是支持在无实例对象产生的情况下调用,那么静态方法更佳;
     * 如果希望实现类能更多的直接应用接口中的方法,则默认方法更适合.
     */
    //默认方法,带方法体,子类可以在实现类中重写,并可以通过接口的引用调用,不重写也可以
    default void connection() {
        System.out.println("我是接口中的默认方法");
    }
    //静态方法,带方法体,不能在实现类中重写,可以用接口名调用
    static void stop() {
        System.out.println("我是接口中的静态方法");
    }
}
/**
 * 接口定义了某一批类所需要遵守的规范
 * 接口不关心这些类的内部数据,也不关心这些类里的方法的实现细节,
 * 它只规定这些类里必须提供某些方法
 */