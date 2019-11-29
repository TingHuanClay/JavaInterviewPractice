package ExchangerDemo;

import java.util.concurrent.Exchanger;

public class ExchangerThreadExample implements Runnable {
	private Exchanger exchanger;
	private String threadName;
	private String message;

	public ExchangerThreadExample(Exchanger exchanger, String threadName, String message) {
		this.exchanger = exchanger;
		this.threadName = threadName;
		this.message = message;
	}
	@Override
	public void run() {
		try {
			System.out.println("[Before exchange] Thread Name: " + threadName + " Message: " + message);
			this.message = (String) this.exchanger.exchange(message);
			System.out.println("[After exchange] Thread Name: " + threadName + " Message: " + message);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
