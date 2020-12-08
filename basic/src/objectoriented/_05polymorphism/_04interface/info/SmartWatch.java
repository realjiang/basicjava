package objectoriented._05polymorphism._04interface.info;

/**
 * 标题: 智能手表
 *
 * @Author: Jiang
 * @Date: 2020/12/8 14:26
 */
public class SmartWatch implements INet{
    public static final int TEMP = 30;
    public void tel() {
        System.out.println("智能手表可以打电话");
    }
    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() {

    }

}
