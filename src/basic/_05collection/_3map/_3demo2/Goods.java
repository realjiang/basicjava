package _05collection._3map._3demo2;

/**
 * 标题: 商品 - Map案例2
 *
 * @Author: Jiang
 * @Date: 2020/12/24 9:46
 */
public class Goods {
    private String id;
    private String name;
    private double prize;

    public Goods() {
    }

    public Goods(String id, String name, double prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "商品编号:" + id +
                ", 商品名称:" + name +
                ", 商品价格:" + prize;
    }
}
