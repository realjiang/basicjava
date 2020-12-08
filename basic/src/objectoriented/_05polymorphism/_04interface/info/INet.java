package objectoriented._05polymorphism._04interface.info;

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

    void connection();
}
/**
 * 接口定义了某一批类所需要遵守的规范
 * 接口不关心这些类的内部数据,也不关心这些类里的方法的实现细节,
 * 它只规定这些类里必须提供某些方法
 */