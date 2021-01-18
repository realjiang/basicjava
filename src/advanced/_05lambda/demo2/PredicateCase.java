package advanced._05lambda.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 标题:Predicate案例
 * 使用Predicate函数式接口作为参数，完成查找字符串集合中包含字符 ‘a‘ 的元素
 *
 * @Author: Jiang
 * @Date: 2021/1/18 10:58
 */
public class PredicateCase {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("java","python","php","HTML");
        System.out.print("集合中的元素有:[");
        for (int i=0;i<strs.toArray().length;i++){
            if (i!=strs.toArray().length-1) {
                System.out.print(strs.get(i)+",");
            } else {
                System.out.print(strs.get(i));
            }
        }
        System.out.println("]");
        filter(strs, n -> n.contains("a"));
    }

    public static void filter(List<String> strs, Predicate<String> pd) {

        for (String str:strs) {
            if (pd.test(str)) {
                System.out.println("集合中包含字符a的元素有:");
                System.out.println(str+" ");
            }
        }
    }
}
