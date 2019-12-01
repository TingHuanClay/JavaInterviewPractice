package CallableDemo;

import java.util.concurrent.Callable;

/**
 * You can also create a class implements Callable
 * to build a thread with return value 
 * [ There is NO return value in the run() of Runnable() ]
 * */
public class CallableExample implements Callable {
	private String message;
	private long sleepTimeMiilis;
	
	public CallableExample(String message, long sleepTimeMiilis) {
		this.message = message;
		this.sleepTimeMiilis = sleepTimeMiilis;
	}

	@Override
	public Object call() throws Exception {
		Thread.sleep(sleepTimeMiilis);
		return this.message;
	}

}
