package _06generics;

/**
 * 标题: 泛型类
 *
 * @Author: Jiang
 * @Date: 2020/11/23 18:10
 */
public class Generics<T>  implements IGenerics<T> {

    String name;
    T t;

    @Override
    public void add(T t) {
        System.out.println("增:" + t);
    }

    @Override
    public void del(T t) {
        System.out.println("删:" + t);
    }

    @Override
    public void update(T t) {
        System.out.println("改:" + t);
    }

    @Override
    public void select(T t) { System.out.println("查:" + t); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "name='" + name + '\'' +
                ", t=" + t +
                '}';
    }
}
