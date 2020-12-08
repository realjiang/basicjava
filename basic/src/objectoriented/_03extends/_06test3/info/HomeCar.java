package objectoriented._03extends._06test3.info;

public final class HomeCar extends Car {
    private int num;

    /**
     * 无参无返回值方法
     */
    public void display() {
        String str = this.getUserName()+"拥有的"+this.getColor()+"颜色的私家车，有"+this.getNum()+"个座位";
        System.out.println(str);
    }

    /**
     * 重载方法
     * @param num 座位数量
     */
    public void display(int num) {
        System.out.println("家用汽车大多有"+num+"个座位");
    }

    /**
     * 无参构造
     */
    public HomeCar() {
    }

    /**
     * 全参构造
     * @param color 颜色
     * @param userName 车主名字
     * @param num 车座个数
     */
    public HomeCar(String color, String userName, int num) {
        super(color, userName);
        this.setNum(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
