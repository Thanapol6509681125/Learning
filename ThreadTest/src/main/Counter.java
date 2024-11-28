package main;

public class Counter {
	
	private int count = 0;
	
	public void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		Runnable task = () -> counter.increment();
		new Thread(task).start();

	}

}
