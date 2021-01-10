package basic._07thread._6communication._1queuedemo;

public class Queue {
	private int n;
	boolean flag=false;
	
	public synchronized int get() {
		if(!flag){
			try {
				wait(); //如果flag为false，容器中没有数据，不能再取，要等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("消费："+n);
		flag=false;//消费完毕，容器中没有数据
		notifyAll();//唤醒其他线程
		return n;
	}

	public synchronized void set(int n) {
		if(flag){
			try {
				wait(); //如果flag为true，容器中有数据，不能再放，要等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("生产："+n);
		this.n = n;
		flag=true;//生产完毕，容器中已经有数据
		notifyAll();//唤醒其他线程
	}
	
}
