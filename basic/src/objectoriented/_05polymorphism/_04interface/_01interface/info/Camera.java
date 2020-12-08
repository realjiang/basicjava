package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 相机
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:06
 */
public class Camera implements IPhoto{
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }
}
