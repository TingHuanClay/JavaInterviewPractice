package SemaphoreDemo;

import java.util.concurrent.Semaphore;

/**
 * Use 'java.util.concurrent.Semaphore' to control
 * the quantity of running threads
 * 
 * Please be NOTICED!!!
 * 
 *  semaphore.acquire() & semaphore.release()
 *  have to be invoked in a pair
 *  
 *  REMEMBER to invoke release() in the end of the task of thread 
 *  when you use acquire() in the beginning
 * */
public class ThreadWithSemaphoreExample implements Runnable{
	private String threadName;
	private Semaphore semaphore;

	public ThreadWithSemaphoreExample(String threadName, Semaphore semaphore) {
		this.threadName = threadName;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			this.semaphore.acquire();
			Thread.sleep(5000L);
			System.out.println("thread name is:" + this.threadName);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			this.semaphore.release();
		}
	}

}
