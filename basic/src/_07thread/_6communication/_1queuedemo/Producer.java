package src._07thread._6communication._1queuedemo;

public class Producer implements Runnable{
	Queue queue;
	Producer(Queue queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		int i=0;
		while(true){
			queue.set(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
