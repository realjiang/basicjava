package basic._07thread._1createdemo;

/**
 * 03——通过实现 Runnable接口的方式实现线程
 */
class PrintRunnable implements Runnable {
    int i = 1;//case2
    @Override
    public void run() {
        //int i = 1;//case1
        while (i < 10) {
            System.out.println(Thread.currentThread().getName()+"正在运行！"+(i++));
        }
    }
}
public class RunnableTest1 {
    public static void main(String[] args) {
        PrintRunnable pr1 = new PrintRunnable();//step1
        Thread t1 = new Thread(pr1); // step2   Runnable接口没有start方法，因此要创建Thread对象，同时将Runnable对象传入
        t1.start(); //step3
        //PrintRunnable pr2 = new PrintRunnable(); //case2，注释掉该句
        //Thread t2 = new Thread(pr2); //case2，注释掉该句
        Thread t2 = new Thread(pr1);//case1，i在run方法里，这里如果传入pr1效果是一样的；case2，移动到方法外作为成员变量，pr1被t1和t2两个线程共享了（即多线程共同处理一个资源），两个线程共同运行10次
        t2.start();
        /**
         * 在run方法中定义int i变量，是局部变量，当运行线程时，就会每个run方法生成一个变量，进行循环累加，所以每个线程会执行10次；
         * 而在run外定义int i变量，是公共变量，几个run方法共用一个变量，进行累加，两个线程总共执行10次。
         */
    }
}
