package src._07thread._3statusdemo;

/**
 * join方法 - 抢占资源
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(getName()+"正在执行"+i+"次");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.start();
        try {
            //mt.join();//mt执行完才执行其他的线程
            mt.join(1);//等待该线程终止的最长时间为XXX毫秒，不管是否结束，会继续执行其他进程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 21; i++) {
            System.out.println("主线程执行正在执行"+i+"次");
        }
        System.out.println("主线程执行结束");
    }
}
