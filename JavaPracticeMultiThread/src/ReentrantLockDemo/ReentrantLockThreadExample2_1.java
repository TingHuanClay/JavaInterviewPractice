package ReentrantLockDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/**
 * Src files:
 * 	ReentrantLockThreadExample2_1.java
 * 	ReentrantLockThreadExample2_2.java
 *  ReentrantLockThreadTest2.java
 * 
 * In this case, we dispaly how to use newCondition() in ReentrantLock
 * to control the execution of threads
 * 
 *  newCondition is quite similar to wait & notify
 *  which it used condition.await() & condition.signal() for wait & notify
 * */
public class ReentrantLockThreadExample2_1 implements Runnable {
	private Lock lock;
	private Condition condition;
	
	public ReentrantLockThreadExample2_1(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	@Override
	public void run() {
		try {
			this.lock.lock();
			System.out.println("RUN THREAD 1-1");
			this.condition.await();
            System.out.println("RUN THREAD 1-2");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			this.lock.unlock();
		}
		
	}

}
