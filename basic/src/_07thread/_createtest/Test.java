package src._07thread._createtest;

/**
 * 1、通过实现Runnable接口的方式创建线程类Cat和Dog，run()方法实现的功能为：加入一个循环长度为3的for循环，分别循环输出信息“A cat”和“A dog”。
 * 2、在测试类中分别创建Cat和Dog类的对象，启动两个线程。
 * 3、在测试类中创建一个循环长度为3的for循环，打印输出信息“main thread”。
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Thread t1 = new Thread(c);
        Dog d = new Dog();
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("main thread");
        }
    }
}

class Cat implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=3; i++) {
            System.out.println(Thread.currentThread().getName()+"A cat");
        }
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <=3; i++) {
            System.out.println(Thread.currentThread().getName()+"A dog");
        }
    }
}
