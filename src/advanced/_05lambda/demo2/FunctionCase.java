package advanced._05lambda.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 标题:Function函数式接口案例
 *
 * @Author: Jiang
 * @Date: 2021/1/18 11:29
 */
public class FunctionCase {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 13, 14, 18, 101));
        System.out.print("集合中的元素有:[");
        for (int i=0;i<nums.toArray().length;i++){
            if (i!=nums.toArray().length-1) {
                System.out.print(nums.get(i)+",");
            } else {
                System.out.print(nums.get(i));
            }
        }
        System.out.println("]");
        Function<List<Integer>,Integer> func= list ->{
            Integer max = 0;
            for (Integer num : list) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        };
        Integer max = func.apply(nums);
        System.out.println("List集合中最大值是:"+max);
    }
}
