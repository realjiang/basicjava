package src._07thread._4priority;

/**
 * 线程的优先级：
 * 优先级高不代表一定先执行，只是概率更大
 */
class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println("thread" + name + "running" + i);
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        //获取主线程优先级
        int mainPriority = Thread.currentThread().getPriority();
//        System.out.println("mainThread's priority is "+mainPriority);
        //创建一个线程，设置优先级
        MyThread mt = new MyThread("thread1");
        MyThread mt2 = new MyThread("thread2");
        //mt.setPriority(10);//method1
        mt.setPriority(Thread.MAX_PRIORITY);//method2
        mt2.setPriority(Thread.MIN_PRIORITY);//method2
        //启动线程
        mt.start();
        mt2.start();
        //打印mt线程对象的优先级
//        System.out.println("thread1's priority is " + mt.getPriority());
    }
}
