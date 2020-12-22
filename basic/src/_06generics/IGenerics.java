package _06generics;

/**
 * 标题: 泛型接口
 *
 * @Author: Jiang
 * @Date: 2020/11/23 18:19
 */
public interface IGenerics<T> {


    public void add(T t);
    public void del(T t);
    public void update(T t);
    public void select(T t);
}
