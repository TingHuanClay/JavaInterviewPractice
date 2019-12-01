package ReentrantLockDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ReentrantLockThreadExample2_2 implements Runnable {
	private Lock lock;
	private Condition condition;
	
	public ReentrantLockThreadExample2_2(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	@Override
	public void run() {
		try {
			this.lock.lock();
			System.out.println("RUN THREAD 2");
			this.condition.signal();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			this.lock.unlock();
		}
		
	}

}
