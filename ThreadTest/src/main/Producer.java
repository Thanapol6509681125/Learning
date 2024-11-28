package main;

public class Producer implements Runnable {
	private Message message;

	public Producer() {
		
	}
	
	public Producer(Message msg) {
		message = msg;
	}
	
	@Override
	public void run() {
		String[] messages = {"Message1", "Message2", "Message3", "Done"};
		for(String msg: messages) {
			message.produce(msg);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
