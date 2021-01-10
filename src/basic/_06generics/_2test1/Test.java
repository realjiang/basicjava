package basic._06generics._2test1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //方式一
//        List<Dog> dogs = new ArrayList<>();
//        Dog badi = new Dog();
//        badi.setName("巴蒂");
//        Dog doudou = new Dog();
//        doudou.setName("豆豆");
//        dogs.add(badi);
//        dogs.add(doudou);
//        List<Cat> cats = new ArrayList<>();
//        Cat huahua = new Cat();
//        huahua.setName("花花");
//        Cat fanfan = new Cat();
//        fanfan.setName("凡凡");
//        cats.add(huahua);
//        cats.add(fanfan);
        //方式二
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("巴蒂"));
        dogs.add(new Dog("豆豆"));
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("花花"));
        cats.add(new Cat("凡凡"));
        AnimalPlay play = new AnimalPlay();
        play.play(dogs);
        play.play(cats);
    }
}
