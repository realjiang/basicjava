package basic.utils.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 标题: 集合排序
 *
 * @Author: Jiang
 * @Date: 2020/11/30 9:28
 */
public class Sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Collections.reverse(list); //集合倒序,会改变原集合
        System.out.println(list);
    }
}
