package main;

public class PrimeTask implements Runnable {
	@Override
	public void run() {
		long count = 0;
		for(long i = 1; i <= 10_000_000; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println(Thread.currentThread().getName() + "found" + count + "prime");
	}
	
	private boolean isPrime(long num) {
		if(num < 2) return false;
		for(long i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

}
