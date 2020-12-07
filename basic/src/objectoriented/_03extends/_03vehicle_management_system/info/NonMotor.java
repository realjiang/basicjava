package objectoriented._03extends._03vehicle_management_system.info;

/**
 * 标题: 非机动车
 *
 * @Author: Jiang 
 * @Date: 2020/12/7 14:56
 */
public class NonMotor {
    private String brand;
    private String color;
    private int wheelnum = 2;
    private int seatnum = 1;

    /**
     * 运行方法
     * @return str
     */
    public String run() {
        String str = "这是一辆"+this.getColor()+"颜色的,"+this.getBrand()+"牌的非机动车,有"
                +this.getWheelnum()+"个轮子,有"+this.getSeatnum()+"个座椅的非机动车。";
        return str;
    }

    /**
     * 无参构造
     */
    public NonMotor() {
    }

    /**
     * 双参构造
     * @param brand 品牌
     * @param color 颜色
     */
    public NonMotor(String brand, String color) {
        this.setBrand(brand);
        this.setColor(color);
    }

    /**
     * 四参构造
     * @param brand 品牌
     * @param color 颜色
     * @param wheelnum 轮子数量
     * @param seatnum 座椅数量
     */
    public NonMotor(String brand, String color, int wheelnum, int seatnum) {
        this.setBrand(brand);
        this.setColor(color);
        this.setWheelnum(wheelnum);
        this.setSeatnum(seatnum);
    }
    /**以下是get/set方法*/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelnum() {
        return wheelnum;
    }

    public void setWheelnum(int wheelnum) {
        this.wheelnum = wheelnum;
    }

    public int getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(int seatnum) {
        this.seatnum = seatnum;
    }
}
