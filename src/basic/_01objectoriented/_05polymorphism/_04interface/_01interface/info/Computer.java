package _01objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 电脑
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:19
 */
public class Computer implements INet{
    /**
     * 方法重写:要求子类重写的方法的访问权限要大于父类方法的访问权限
     */
    @Override
    public void network() {
        System.out.println("电脑可以上网");
    }

    @Override
    public void connection() {

    }
}
