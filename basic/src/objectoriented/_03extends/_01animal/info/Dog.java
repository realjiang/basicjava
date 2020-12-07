package objectoriented._03extends._01animal.info;

/**
 * 标题: 动物类
 *
 * @Author: Jiang
 * @Date: 2020/12/2 17:48
 */
public class Dog extends Animal {
    private  int sex;
    private static String test;

    public Dog() {
         //super(super.hh); //写法一,
         //super(hh); //写法二
        System.out.println("子类无参构造");
//        super("1"); //写法三
//        super(name); //写法四
//        super(test); //写法无
    }

    public Dog(int sex) {
        // 子类构造默认调用父类的无参构造
        this.setSex(sex);
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 重写父类eat()方法
     */
    public void eat() {

        System.out.println(this.getName()+"最近没有食欲~");
    }

    public void sleep() {
        eat();//调用子类eat方法
        super.eat();//调用父类eat方法,super是指当前类父类的对象,还可以访问父类可以被继承和访问的属性,不可以在main方法中使用
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大了，它在睡觉。。。");
    }

    //子类继承后的初始化顺序?
    /**
     * 1.加载父类静态成员, 加载父类静态代码块(注:访问修饰符不影响成员加载顺序,与成员书写位置有关,如果静态代码块在静态成员前,则先加载静态代码块)
     * 2.加载子类静态成员, 加载子类静态代码块
     * 3.子类→父类→父类的父类....→Object类  追根溯源:一层层往上找,但不会执行构造方法内语句
     * 4.Object类→...→子类 从源头往下按顺序实例化成员属性,给成员属性赋值(没赋值的,使用默认值),执行构造代码块,构造方法...
     *      4.1 实例化父类成员属性,给父类成员属性赋值(没赋值的,使用默认值),执行父类构造代码块,回到父类构造方法,进行父类构造方法内语句的执行
     *      4.2 实例化子类成员属性,给子类成员属性赋值(没赋值的,使用默认值),执行子类构造代码块,回到子类构造方法,进行子类构造方法内语句的执行
     * 5.至此子类实例化完成~
     */
    //子类实例化的时候,能否决定调用父类的哪个构造方法呢?
    /**
     * 1.虽然父类的构造不允许被继承、重写,但是会影响子类对象的实例化
     * 2.子类构造默认调用父类的无参构造,这也是建议无论是否使用无参构造都要手动写一个无参构造的原因
     * 3.如果子类非要调用父类特定的某个构造方法，可以使用super()调用父类允许被访问的其他构造方法
     *      3.1 super()必须放在子类构造方法有效代码第一行!
     *      3.2 super 不能在静态上下文中调用
     *      3.3 构造方法中 super和this不能共存
     */
}
