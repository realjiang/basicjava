package basic._07thread._3status;

/**
 * sleep方法
 */
class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 16; i++) {
            System.out.println(Thread.currentThread().getName()+"执行第"+i+"次！");
            try {
                Thread.sleep(1000); //1。休眠的过程中可能出现，线程被打断的情况，需要处理这个异常2。休眠后线程会进入可运行阶段，再到正在运行阶段，时间会有误差
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SleepDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        Thread t1 = new Thread(mt);
        t1.start();
        /**
         * 当有两个线程时，基本上每1000毫秒，两个线程是交替进行的
         * 因为一个线程休眠的过程中，另一个线程抢占到cpu给的可运行权限的机率更大
         */
    }
}
