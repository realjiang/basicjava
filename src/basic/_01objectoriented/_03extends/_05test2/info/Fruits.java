package _01objectoriented._03extends._05test2.info;

/**
 * 标题: 水果
 *
 * @Author: Jiang
 * @Date: 2020/12/7 16:51
 */
public class Fruits {
    private String shape;
    private String taste;

    /**
     * eat方法
     */
    public void eat() {
        System.out.println("水果可供人们食用!");
    }

    /**
     * 重写Object的equals方法
     * @param object 对象
     * @return boolean
     */
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Fruits fruits = (Fruits) object;
        if (fruits.getShape().equals(this.getShape()) && fruits.getTaste().equals(this.getTaste())) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * 无参构造
     */
    public Fruits() {
    }

    /**
     * 全参构造
     * @param shape 形状
     * @param taste 味道
     */
    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
