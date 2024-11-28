package main;

public class ThreadExample {

	public static void main(String[] args) {
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				System.out.println("Running in thread: " + Thread.currentThread().getName());
			}
		}
		
		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(() -> System.out.println("Lambda thread: " + Thread.currentThread().getName()));
		
		thread1.start();
		thread2.start();
	}

}
