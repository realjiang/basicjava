package objectoriented._03extends._05test2.info;

/**
 * 标题: 仙人蕉
 *
 * @Author: Jiang
 * @Date: 2020/12/7 16:52
 */
public class Banana extends Fruits{
    private String variety;

    public void advantage() {
        String str = this.getVariety() + "果形" + this.getShape() + ",果肉香甜,可供生食。";
        System.out.println(str);
    }

    public void advantage(String color) {
        String str = this.getVariety()+"颜色为"+color;
        System.out.println(str);
    }

    public Banana() {
    }

    public Banana(String shape, String taste, String variety) {
        super(shape, taste);
        this.setVariety(variety);
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
