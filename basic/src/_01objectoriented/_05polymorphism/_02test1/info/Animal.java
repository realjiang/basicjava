package _01objectoriented._05polymorphism._02test1.info;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 11:14
 */
public class Animal {
    /**
     * 种类
     */
    private String kind;

    public void cry() {
        System.out.println("动物叫");
    }

    public Animal() {
    }

    public Animal(String kind) {
        this.setKind(kind);
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
