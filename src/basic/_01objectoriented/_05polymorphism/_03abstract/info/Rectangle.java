package _01objectoriented._05polymorphism._03abstract.info;

/**
 * 标题: 矩形
 *
 * @Author: Jiang
 * @Date: 2020/12/8 13:38
 */
public class Rectangle extends Shape{
    /**
     * 长
     */
    private double length;
    /**
     * 宽
     */
    private double wide;

    public Rectangle() {
    }

    public Rectangle(double length, double wide) {
        this.setLength(length);
        this.setWide(wide);
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    /**
     * 重写父类area方法
     * @return 面积
     */
    @Override
    public double area() {
        return this.getLength()*this.getWide();
    }
}
