/*
 * Create thread class by implements Runnable
 * */
public class ThreadExample2 implements Runnable{
	private String msg;
	
	public ThreadExample2(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println("Thread Message: " + this.msg);
	}
}
