package ExecutorServiceDemo;

public class ThreadExample implements Runnable {

	@Override
	public void run() {
		String threadName= Thread.currentThread().getName();
	    System.out.println("running " + threadName + " thread");
	}
}
