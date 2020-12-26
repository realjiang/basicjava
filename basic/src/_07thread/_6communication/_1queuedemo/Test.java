package src._07thread._6communication._1queuedemo;

public class Test {

	public static void main(String[] args) {
		Queue queue=new Queue();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}

}
