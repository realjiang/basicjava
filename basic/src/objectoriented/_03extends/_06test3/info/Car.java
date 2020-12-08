package objectoriented._03extends._06test3.info;

public class Car {
    private String color;
    private String userName;

    /**
     * 无参，无返回值方法use
     */
    public void use() {
        System.out.println("我是机动车！");
    }

    /**
     * 重写Object的equals方法
     * @param obj obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Car car = (Car) obj;
        if (car.getColor().equals(this.getColor())&&car.getUserName().equals(this.getUserName())){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 无参构造
     */
    public Car() {
    }

    /**
     * 全参构造
     * @param color 车的颜色
     * @param userName 车主名字
     */
    public Car(String color, String userName) {
        this.setColor(color);
        this.setUserName(userName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
