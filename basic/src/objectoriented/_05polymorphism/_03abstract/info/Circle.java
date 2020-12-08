package objectoriented._05polymorphism._03abstract.info;

/**
 * 标题: 圆形
 *
 * @Author: Jiang
 * @Date: 2020/12/8 13:37
 */
public class Circle extends Shape{
    /**
     * 半径
     */
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    /**
     * 重写父类area方法
     * @return 面积
     */
    @Override
    public double area() {
        return Math.PI*this.getR()*this.getR();
    }
}
