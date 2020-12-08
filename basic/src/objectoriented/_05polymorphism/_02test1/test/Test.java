package objectoriented._05polymorphism._02test1.test;

import objectoriented._05polymorphism._02test1.info.Animal;
import objectoriented._05polymorphism._02test1.info.Cat;
import objectoriented._05polymorphism._02test1.info.Dog;
import objectoriented._05polymorphism._02test1.info.Sheep;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 11:15
 */
public class Test {
    public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal[] animals = new Animal[5];
        //产生随机数，随机产生三种具体子类的实例
        for (int i = 0; i < animals.length; i++) {
            int n = (int) (Math.random() * 3);
            switch (n) {
                case 0:animals[i] = new Cat();break;
                case 1:animals[i] = new Dog();break;
                case 2:animals[i] = new Sheep();break;
            }
        }
        //循环输出，循环体中每个对象分别调用cry()方法。
        for (Animal animal:animals) {
            animal.cry();
        }
    }
}
