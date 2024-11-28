package main;

public class MonitorTest {

	public static void main(String[] args) {
		Message message = new Message();
		Thread thread1 = new Thread(new Producer(message), "Thread-Producer");
		Thread thread2 = new Thread(new Consumer(message), "Thread-Consumer");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
