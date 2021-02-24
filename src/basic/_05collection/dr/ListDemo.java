package basic._05collection.dr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 标题: 实体集合按多字段去重,选时间最新的
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/23 17:28
 */
public class ListDemo {
    public static void main(String[] args) {
        // 当前日期前一天的办件信息
        List<Apply> applyList = new ArrayList<>();
        Apply a1 = new Apply();
        a1.setInternalNo("123");
        a1.setCurrentLinkName("123");
        a1.settVersion("123");
        a1.setAcceptanceNum("1");
        a1.setNo("1");

        Apply a2 = new Apply();
        a2.setInternalNo("123");
        a2.setCurrentLinkName("123");
        a2.settVersion("123");
        a2.setAcceptanceNum("2");
        a2.setNo("2");

        Apply a3 = new Apply();
        a3.setInternalNo("123");
        a3.setCurrentLinkName("456");
        a3.settVersion("123");
        a3.setAcceptanceNum("2");
        a3.setNo("3");

        Apply a4 = new Apply();
        a4.setInternalNo("123");
        a4.setCurrentLinkName("123");
        a4.settVersion("456");
        a4.setAcceptanceNum("3");
        a4.setNo("4");

        Apply a5 = new Apply();
        a5.setInternalNo("123");
        a5.setCurrentLinkName("123");
        a5.settVersion("123");
        a5.setAcceptanceNum("1");
        a5.setNo("1");

        applyList.add(a1);
        applyList.add(a2);
        applyList.add(a3);
        applyList.add(a4);
        applyList.add(a5);

        /**applyList去重*/
        //1.按同步时间降序排序
        applyList.sort(Comparator.comparing(Apply::getNo,Comparator.reverseOrder()));
        //2.按其他字段去重

        //todo 法一
        List<Apply> applyList_dr  = applyList.stream().
                collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(o -> o.getInternalNo() + ";"
                                + o.getCurrentLinkName() + ";"
                                + o.gettVersion()))), ArrayList::new));
        for (Apply apply : applyList_dr) {
            System.out.println(apply.toString());
        }
    }

}
