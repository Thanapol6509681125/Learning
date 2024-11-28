package main;

public class Consumer implements Runnable {
	private Message message;
	
	public Consumer(){
		
	}
	
	public Consumer(Message msg) {
		message = msg;
	}
	
	
	@Override
	public void run() {
		String msg;
		do {
			msg = message.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(!"Done".equals(msg));
		
	}

}
