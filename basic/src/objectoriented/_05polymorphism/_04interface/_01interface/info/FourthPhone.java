package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 四代手机
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:08
 */
public class FourthPhone extends ThirdPhone implements IPhoto,INet{
    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }

    @Override
    public void connection() {
        System.out.println("我是四代手机的默认方法");
    }

    public void network() {
        System.out.println("手机可以上网");
    }
}
