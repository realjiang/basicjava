package src._06generics._1demo1;

import java.util.List;

public class GoodsSeller {
//    public void sellGoods(List<Goods> goodsList) { //案例一，传入参数只能是Goods类的
    public void sellGoods(List<? extends Goods> goodsList) { //案例二，传入参数只能是Goods类或其子类
        //调用集合中的sell 方法
        for (Goods goods:goodsList) {
            goods.sell();
        }
    }
}
