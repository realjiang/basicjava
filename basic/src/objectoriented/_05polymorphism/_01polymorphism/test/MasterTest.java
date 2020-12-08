package objectoriented._05polymorphism._01polymorphism.test;

import objectoriented._05polymorphism._01polymorphism.info.Animal;
import objectoriented._05polymorphism._01polymorphism.info.Cat;
import objectoriented._05polymorphism._01polymorphism.info.Dog;
import objectoriented._05polymorphism._01polymorphism.info.Master;

/**
 * 标题:
 *
 * @Author: Jiang
 * @Date: 2020/12/8 10:40
 */
public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();
        master.feed(one);
        master.feed(two);
        System.out.println("=========================");
        /*boolean isManyTime = true;
        Animal temp;
        if (isManyTime) {
            temp =  master.hasManyTime();
        }else{
            temp = master.haslittleTime();
        }
        System.out.println(temp);*/
        System.out.println("------------------------------");
        boolean isManyTime = false;
        Animal temp = master.raise(isManyTime);
        System.out.println(temp);
    }
}
