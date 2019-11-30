package ReentrantLockDemo;

import java.util.List;
import java.util.concurrent.locks.Lock;

/**
 * ReentrantLock is similar to synchronized, 
 * but you can control concurrency by the function it provided
 * lock() & unlock() which have to be in pair
 * */
public class ReentrantLockThreadExample implements Runnable {

	private Lock lock;
	private String threadName;
	private List<String> list;

	public ReentrantLockThreadExample(String threadName, Lock lock, List<String> list) {
		this.threadName = threadName;
		this.lock = lock;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			this.lock.lock();
			for (int i = 1 ; i <= 10 ; i++) {
				Thread.sleep(1000L);
				this.list.add("Value-" + i);
				System.out.println(threadName + " add Value-" + i);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			this.lock.unlock();
		}
	}

}
