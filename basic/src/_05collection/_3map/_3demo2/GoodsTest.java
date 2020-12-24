package _05collection._3map._3demo2;

import java.util.*;

/**
 * 标题: 测试类
 *
 * @Author: Jiang
 * @Date: 2020/12/24 11:15
 */
public class GoodsTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //定义HashMap对象
        Map<String, Goods> goodsMap = new HashMap<>();
        System.out.println("请输入三条商品信息");
        int i = 0;
        while (i < 3) {
            System.out.println("请输入第" + (i + 1) + "条商品信息:");
            System.out.println("请输入商品编号:");
            String goodsId = console.next();
            //判断商品编号id是否存在
            if (goodsMap.containsKey(goodsId)) {
                System.out.println("该商品编号已经存在,请重新输入!");
                continue;
            }
            System.out.println("请输入商品名称:");
            String goodsName = console.next();
            System.out.println("请输入商品价格:");
            double goodsPrice = 0;
            try {
                goodsPrice = console.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("商品价格的格式不正确,不是数值类型!请输入数值型数据!");
                console.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            //将商品信息放入HashMap
            goodsMap.put(goodsId, goods);
            i++;
        }
        //遍历Map,输出商品信息
        System.out.println("商品的全部信息为:");
        Iterator<Goods> it = goodsMap.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /**
         * 安全隐患1:key不可重复,如果key相同,只会保留一个,后插入的会把之前的覆盖掉.要增加id重复判断.
         * 安全隐患2:nextDouble(),如果输入了错误的类型,运行会报错,要进行异常处理.
         */
    }
}
