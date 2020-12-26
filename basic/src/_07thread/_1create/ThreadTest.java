package src._07thread._1create;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 为啥继承Thread类就是 线程了？
 * 规定，java底层已经写好了，按照这种方式做就能得到线程
 */
class MyThread extends Thread {
    public  void run() {
        System.out.println(getName()+"线程正在执行！");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThread mt = new MyThread();
        mt.start();
        //mt.start();//启动线程(线程只能启动一次，超过一次会抛出异常Exception in thread "main" java.lang.IllegalThreadStateException)
        System.out.println("主线程2");
        /**
         * 线程运行的顺序是cpu随机分配的
         */
    }
}
