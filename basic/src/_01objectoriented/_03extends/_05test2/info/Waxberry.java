package _01objectoriented._03extends._05test2.info;

/**
 * 标题: 杨梅
 *
 * @Author: Jiang
 * @Date: 2020/12/7 16:52
 */
public final class Waxberry extends Fruits{
    private String color;

    public final void face() {
        String str = "杨梅:"+this.getColor()+","+this.getShape()+",果味酸甜适中。";
        System.out.println(str);
    }

    public void eat() {
        System.out.println("杨梅酸甜适中,非常好吃!");
    }

    public String toString() {
        String str = "杨梅的信息:果实为"+this.getShape() + "," + this.getColor() + "," + this.getTaste()+",非常好吃!";
        return str;
    }

    public Waxberry() {
    }

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
