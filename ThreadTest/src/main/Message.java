package main;

public class Message {
	private String message;
	private boolean hasMessage;
	
	public synchronized void produce(String msg) {
		while(hasMessage){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		message = msg;
		hasMessage = true;
		System.out.println("Produced Message: " + msg);
		notify();
	}
	
	public synchronized String consume() {
		while(!hasMessage) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		hasMessage = false;
		return message;
	}

}
