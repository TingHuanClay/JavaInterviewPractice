package ExecutorServiceDemo;

import java.util.Date;

public class Thread4ScheduledExample implements Runnable {
	private long lastTime;

	public Thread4ScheduledExample(long lastTime) {
		this.lastTime = lastTime;
	}

	@Override
	public void run() {
		String threadName= Thread.currentThread().getName();
	    System.out.println("running " + threadName + " thread on " + (new Date().getTime() - lastTime));
	}
}
