package objectoriented._05polymorphism._01polymorphism.test;

import objectoriented._05polymorphism._01polymorphism.info.Animal;
import objectoriented._05polymorphism._01polymorphism.info.Cat;
import objectoriented._05polymorphism._01polymorphism.info.Dog;

/**
 * 标题: 多态知识点1
 *
 * @Author: Jiang
 * @Date: 2020/12/8 10:05
 */
public class Test {
    public static void main(String[] args) {
//        Animal one = new Animal();//报错,抽象类不允许实例化
        /**
         * 向上转型/隐式转型/自动转型   -> 父类引用指向子类实例 / 子类转为父类
         * 可以调用子类重写父类的方法,父类派生的方法,但无法调用子类独有方法
         * 注意:父类中的静态方法无法被子类重写,所以向上转型后,只能调用到父类原有的静态方法
         */
        Animal two = new Cat();
        Animal three;
        Dog dog = new Dog();
        three = dog;
//        one.eat();
        two.eat();
        three.eat();
        System.out.println("==============================================");
        /**
         * 向下转型/强制类型转换
         * 子类引用指向父类对象,此处必须进行强转,可以调用子类特有的方法
         * 必须满足转型条件才能进行转换
         * A instanceof B 判断A是否满足B的实例的特征,是返回true,不是返回false;
         *  注:如果B是A所属类的父类时,也会返回true
         */
        Cat temp = (Cat) two;
        temp.eat();
        temp.run();
        temp.getMonth();
        System.out.println("-------------------------------------");
        //报错! two虽然是Animal类型,但是指向的是Cat的引用,所以能强转成cat,但不能强转成dog
        /*Dog temp1 = (Dog) two;
        temp1.eat();
        temp1.sleep();
        temp1.getMonth();*/
        System.out.println("-------------------------------------");
        if (two instanceof Cat) {
            Cat temp2 = (Cat) two;
            temp.eat();
            temp.run();
            temp.getMonth();
            System.out.println("two可以转换为Cat类型");
        }
        System.out.println("-------------------------------------");
        if (two instanceof Dog) {
            Dog temp3 = (Dog) two;
            temp3.eat();
            temp3.sleep();
            temp3.getMonth();
            System.out.println("two可以转换为Dog类型");
        }
        System.out.println("-------------------------------------");
        if (two instanceof Animal) {
            System.out.println("Animal");
        }
        if (two instanceof Object) {
            System.out.println("Object");
        }
        System.out.println("===========================================");
        Animal animal = new Cat();
        animal.say(); //子类不能重写父类静态方法,即使写的方式和重写一样,但是还是属于子类特有的静态方法,这句执行的是父类原有的静态方法
        //如果要调用子类自己的静态方法,可以通过向下转型 将animal再转回Cat类型,就可以了
        Cat cat = (Cat) animal;
        cat.say();
    }
}
