package src.objectoriented._03extends._06test3.info;

public final class HomeCar extends Car{
    private int num;

    public void display() {
        String str = this.getUserName()+"拥有的"+this.getColor()+"颜色的私家车，有"+this.getNum()+"个座位";
        System.out.println(str);
    }

    public void display(int num) {
        System.out.println("家用汽车大多有"+num+"个座位");
    }
    public HomeCar() {
    }

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
