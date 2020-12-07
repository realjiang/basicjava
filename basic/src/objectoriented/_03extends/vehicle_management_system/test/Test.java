package objectoriented._03extends.vehicle_management_system.test;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import objectoriented._03extends.vehicle_management_system.info.Bicycle;
import objectoriented._03extends.vehicle_management_system.info.ElectricVehicle;
import objectoriented._03extends.vehicle_management_system.info.NonMotor;
import objectoriented._03extends.vehicle_management_system.info.Tricycle;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/7 15:18
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("父类信息测试:");
        NonMotor nonMotor = new NonMotor("天宇","红",4,2);
        System.out.println(nonMotor.run());
        System.out.print("自行车类信息测试:");
        Bicycle bicycle = new Bicycle("捷安特","黄");
        System.out.println(bicycle.run());
        System.out.print("电动车类信息测试:");
        ElectricVehicle electricVehicle = new ElectricVehicle("飞鸽");
        System.out.println(electricVehicle.run());
        System.out.print("三轮车类信息测试:");
        Tricycle tricycle = new Tricycle();
        System.out.println(tricycle.run());
    }
    /** 运行结果
     * 父类信息测试:这是一辆红颜色的,天宇牌的非机动车,有4个轮子,有2个座椅的非机动车。
     * 自行车类信息测试:这是一辆黄颜色的,捷安特牌的自行车。
     * 电动车类信息测试:这是一辆使用飞鸽牌电池的电动车。
     * 三轮车类信息测试:三轮车是一款有3个轮子的非机动车。
     */
}
