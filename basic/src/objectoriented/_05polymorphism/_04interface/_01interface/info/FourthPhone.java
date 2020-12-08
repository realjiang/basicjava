package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 四代手机
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:08
 */
public class FourthPhone extends ThirdPhone implements IPhoto{
    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }

    public void network() {
        System.out.println("手机可以上网");
    }
}
