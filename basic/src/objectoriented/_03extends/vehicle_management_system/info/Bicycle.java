package objectoriented._03extends.vehicle_management_system.info;

/**
 * 标题: 自行车
 *
 * @Author: Jiang
 * @Date: 2020/12/7 14:57
 */
public class Bicycle extends NonMotor{
    /**
     * 无参构造
     */
    public Bicycle() {
    }

    /**
     * 双参构造
     * @param brand 品牌
     * @param color 颜色
     */
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    /**
     * 重写父类run方法
     * @return
     */
    public String run() {
        String str = "这是一辆"+this.getColor()+"颜色的,"+this.getBrand()+"牌的自行车。";
        return str;
    }
}
