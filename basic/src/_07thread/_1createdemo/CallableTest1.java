package src._07thread._1createdemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 04 实现callable接口，重写call（）方法
 */
class ThirdThread implements Callable<String> { //1。创建callable接口实现类，重写call方法
    @Override
    public String call() throws Exception {
        //方法类型可以根据要返回值的类型进行确认
        String str = "多线程的第三种创建方式";
        return str;
    }
}
public class CallableTest1 {
    public static void main(String[] args) {
        //2。创建callable接口实现类ThirdThread的实例
        Callable<String> call = new ThirdThread();
        //3.使用FutureTask类来包装Callable对象，该FutureTask对象封装了该Callable对象的call方法的返回值
        FutureTask<String> ft = new FutureTask<>(call);
        //4.使用FutureTask对象作为Thread对象的target创建并启动新线程
        Thread t = new Thread(ft);
        //5。启动线程，要先启动线程才能获得call的返回值
        t.start();
        //6。调用FutureTask对象的get方法来获得自线程执行结束后的返回值
        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
