/*
 * Create thread class by implements Runnable
 * */
public class ThreadExample2_withSleep implements Runnable{
	private String msg;
	
	public ThreadExample2_withSleep(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000L);
			System.out.println("Thread Message: " + this.msg);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
