package _01objectoriented._05polymorphism._01polymorphism.info;

/**
 * 标题: 动物
 *
 * @Author: Jiang
 * @Date: 2020/12/8 9:58
 */

/**
 * 抽象类:
 * 1.不允许直接实例化,只能被继承;可以通过向上转型,指向子类实例。
 * 2.位置可以和public互换,但不能和class互换。
 * 3.不能与final关键字共存。因为final关键字使得类不可继承，而abstract类如果不能被继承则没有了意义，且会编译报错。
 * 3.意义：
 *      为其子类提供一个公共的类型（父类引用指向子类对象）
 *      封装子类中的重复内容（成员变量和方法）
 *      将父类设计出抽象类后，既可借由父子继承关系限制子类的设计随意性，在一定程度上避免了无意义的父类实例化
 * 4.应用场景:
 *      某个父类只是知道其子类应该包含怎样的方法,但无法准确知道这些子类如何实现这些方法。
 */
public abstract class Animal {
    private String name;
    private int month;

    /**
     * 抽象方法:
     * 1.不允许有方法体
     * 2.子类需要重写该方法
     *    如果子类不想重写该方法,且不希望程序报错,那么子类也要变为抽象类
     * 3.包含抽象方法的类一定是抽象类;但抽象类中不一定要有抽象方法.
     * 4.不能与static,final,private共存
     *      static:静态方法也不允许在子类中重写（详情见程序底部注释）
     *      final:方法不允许被子类重写,而抽象方法必须在子类被重写
     *      private:私有的,不能被其他类访问,这样子类无法访问到也无法重写该方法了
     */
    public abstract void eat();

    public static void say() {
        System.out.println("动物喊叫");
    }

    public Animal() {
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * 静态方法为什么不能被子类重写?
     * 静态方法可以被继承，但是，不能被重写。
     * 如果父类中定义的静态方法在子类中被重新定义，那么在父类中定义的静态方法将被隐藏。
     * 可以使用语法：父类名.静态方法调用隐藏的静态方法。 Animal.say();
     *             或者将父类实例化,通过对象名.静态方法来调用。 Animal animal = new Animal();  animal.say();
     * 如果父类中含有一个静态方法，且在子类中也含有一个返回类型、方法名、参数列表均与之相同的静态方法，
     * 那么该子类实际上只是将父类中的该同名方法进行了隐藏，而非重写。
     * 换句话说，父类和子类中含有的其实是两个没有关系的方法，它们的行为也并不具有多态性.
     * 因此，通过一个指向子类对象的父类引用变量来调用父子同名的静态方法时，只会调用父类的静态方法。
     *    Animal animal = new Cat();
     *    animal.say(); //这里调用的是父类的静态方法
     * 如果要调用子类自己的静态方法,可以通过向下转型 将animal再转回Cat类型,就可以了
     *   Cat cat = (Cat) animal;
     *   cat.say(); //这里调用的是子类的静态方法
     *
     */
}
