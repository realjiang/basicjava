package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 智能手表
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:26
 */
public class SmartWatch implements INet{
    public static final int TEMP = 30;
    public void tel() {
        System.out.println("智能手表可以打电话");
    }
    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() { //重写接口的默认方法时,要去掉default关键字
        INet.super.connection();//调用接口中非静态成员/方法,要用super
        INet.stop();//通过接口名,只能调用接口中静态成员/方法
    }

    public void connection(String str) {
        System.out.println("我是实现类的重载方法,接口引用调不到,要通过实现类引用才能调用");
    }
    /**
     * 1.如果一个类实现了多个接口,多个接口中有一样的默认方法
     * 这时编译器会不知道选择哪一个实现,要怎么区分?
     * 解决的办法是:在实现类中重写这个方法
     * 最后通过这些接口引用调用的都是实现类中重写的方法
     * 2.对1进行扩展,如果这个类还继承了另外一个类,继承的那个父类中也有个一样的方法,要怎么区分?
     *
     */
}
