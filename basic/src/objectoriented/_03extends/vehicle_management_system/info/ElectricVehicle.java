package objectoriented._03extends.vehicle_management_system.info;

/**
 * 标题: 电动车
 *
 * @Author: Jiang
 * @Date: 2020/12/7 14:57
 */
public class ElectricVehicle extends NonMotor{
    private String batterybrand;

    /**
     * 重写父类run方法
     * @return str
     */
    public String run() {
        String str = "这是一辆使用"+this.getBatterybrand()+"牌电池的电动车。";
        return str;
    }

    /**
     * 无参构造
     */
    public ElectricVehicle() {
    }

    /**
     * 带参构造
     * @param batterybrand 电池品牌
     */
    public ElectricVehicle(String batterybrand) {
        this.batterybrand = batterybrand;
    }
    /**以下是get/set方法*/
    public String getBatterybrand() {
        return batterybrand;
    }

    public void setBatterybrand(String batterybrand) {
        this.batterybrand = batterybrand;
    }
}
