package objectoriented._05polymorphism._04interface._04test.info;

/**
 * 标题: 子接口
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:13
 */
/**
 * 1.接口可以继承,且可以继承多个接口
 * 2.实现一个接口时,要重写该接口,以及该接口继承的所有接口的所有方法
 */
public interface ISon extends IFather,IFather2{
    public void run();

    /**
     * 3.继承的多个接口有同名默认方法时,编译器不知道该用哪个的,解决方法:该接口自己创建一个同名默认方法
     */
    default void connection() {
        System.out.println("ISon的默认方法connection");
    }
}
/**
 * 当我们更希望描述多种毫无关系的类型之间的共同行为能力时,更推荐使用接口;
 * 当多类间可以形成可追溯的产生轨迹时,通过抽象类继承则是更加推荐的选择.
 */
