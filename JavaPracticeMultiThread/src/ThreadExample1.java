
/*
 * Create thread class by extends Thread
 * */
public class ThreadExample1 extends Thread{
	private String msg;
	
	public ThreadExample1(String msg) {
		this.msg = msg;
	}
	
	public void run() {
		System.out.println("Thread Message: " + this.msg);
	}
}
