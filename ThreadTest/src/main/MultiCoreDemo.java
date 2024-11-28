package main;

public class MultiCoreDemo {

	public static void main(String[] args) {
		int numThreads = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of CPU core: " + numThreads);
		
		Thread[] threads = new Thread[numThreads];
		
		for(int i = 0; i < numThreads; i++) {
			threads[i] = new Thread(new PrimeTask(), "Threads-" + i);
		}
		
		for(Thread thread: threads) {
			thread.start();
		}
		
		for(Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
