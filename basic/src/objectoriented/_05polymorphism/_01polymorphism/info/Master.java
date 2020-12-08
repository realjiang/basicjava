package objectoriented._05polymorphism._01polymorphism.info;

import javax.sound.midi.SoundbankResource;
import javax.xml.transform.Source;

/**
 * 标题: 主人
 *
 * @Author: Jiang
 * @Date: 2020/12/8 10:36
 */
public class Master {
    /**
     * case1:喂宠物
     * 喂猫咪:吃完东西后,主人会带着去玩线球
     * 喂狗狗:吃完东西后,主人会带着狗狗取睡觉
     */
    //方案一.重载的实现方式:编写方法,传入不同类型的动物,调用各自的方法
    /*public void feed(Cat cat) {
        cat.eat();
        cat.playball();
    }

    public void feed(Dog dog) {
        dog.eat();
        dog.sleep();
    }*/

    //方案二.类型转换的实现方式:编写方法传入动物的父类,方法中通过类型转换,调用指定子类的方法
    public void feed(Animal animal) { //相当于先向上转型,再向下转型
        if (animal instanceof Cat) {
            Cat temp = (Cat) animal;
            temp.eat();
            temp.playball();
        } else if (animal instanceof Dog) {
            Dog temp = (Dog) animal;
            temp.eat();
            temp.sleep();
        }
    }

    /**
     * case2:饲养何种宠物
     * 空闲时间多:养狗狗
     * 空闲时间不多:养猫咪
     */
    //方案一
    /*public Dog hasManyTime() {
        System.out.println("主人休闲时间比较充足,适合养狗");
        return new Dog();
    }

    public Cat haslittleTime() {
        System.out.println("主人平时太忙,适合养猫");
        return new Cat();
    }*/

    //方案二
    public Animal raise(boolean isManyTime) {
        if (isManyTime) {
            System.out.println("主人休闲时间比较充足,适合养狗");
            return new Dog();
        } else {
            System.out.println("主人平时太忙,适合养猫");
            return new Cat();
        }
    }
}
