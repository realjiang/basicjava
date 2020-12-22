package _01objectoriented._05polymorphism._04interface._04test.info;

/**
 * 标题: 父接口2
 *
 * @Author: Jiang
 * @Date: 2020/12/8 17:13
 */
public interface IFather2 {
     void fly();

    default void connection() {
        System.out.println("IFather2的默认方法connection");
    }

}
