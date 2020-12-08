package objectoriented._05polymorphism._04interface._01interface.info;

/**
 * 标题: 具有拍照能力的接口
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:05
 */
public interface IPhoto {
    /**
     * 具有拍照的能力
     */
    public void photo();

    /**
     * 与INet接口中同名的默认方法
     */
    default void connection() {
        System.out.println("我是接口中的默认方法");
    }
}

