package src._07thread._1createdemo;

/**
 * 02——继承Thread类来实现 带名字的 线程
 */
class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);//调用父类构造方法
    }
    public  void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName()+"正在运行"+i);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2("线程1");
        MyThread2 mt2 = new MyThread2("线程2");
        mt1.start();
        mt2.start();
    }
}
