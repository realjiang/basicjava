package src._06generics._1demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class GoodsTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller goodsSeller = new GoodsSeller();
        //goodsSeller.sellGoods(books);//案例一：编译错误，类型要一致
        goodsSeller.sellGoods(books);//案例二：编译正确
    }
}
