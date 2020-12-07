package objectoriented._03extends.vehicle_management_system.info;

/**
 * 标题: 三轮车
 *
 * @Author: Jiang
 * @Date: 2020/12/7 14:58
 */
public class Tricycle extends NonMotor{
    /**
     * 无参构造
     */
    public Tricycle() {
        //修改轮子属性值
        super.setWheelnum(3);
    }

    /**
     * 重写父类run方法
     * @return str
     */
    public String run() {
        String str = "三轮车是一款有"+this.getWheelnum()+"个轮子的非机动车。";
        return str;
    }
}
