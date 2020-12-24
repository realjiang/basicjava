package _05collection._4sort.comparable._1demo;

/**
 * 标题: 商品 - Comparable接口 (在定义类时就实现Comparable接口)
 *
 * @Author: Jiang
 * @Date: 2020/12/24 9:46
 */
public class Goods implements Comparable<Goods>{
    private String id;//商品编号
    private String name;//商品名称
    private double prize;//商品价格

    @Override
    public int compareTo(Goods o) {
        //按价格降序排序
        //取出商品价格
        double price1 = this.getPrize();
        double price2 = o.getPrize();
        return (new Double(price2-price1)).intValue();
    }

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
