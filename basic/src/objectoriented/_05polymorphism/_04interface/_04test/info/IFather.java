package objectoriented._05polymorphism._04interface._04test.info;

/**
 * 标题: 父接口
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:13
 */
public interface IFather {
     void say();

    default void connection() {
        System.out.println("IFather的默认方法connection");
    }
}
