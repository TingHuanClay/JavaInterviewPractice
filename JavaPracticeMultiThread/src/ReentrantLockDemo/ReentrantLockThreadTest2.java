package ReentrantLockDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThreadTest2 {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		ReentrantLockThreadExample2_1 runable1 = new ReentrantLockThreadExample2_1(lock, condition);
		Thread thread1 = new Thread(runable1);
		thread1.start();
		

		ReentrantLockThreadExample2_2 runable2 = new ReentrantLockThreadExample2_2(lock, condition);
		Thread thread2 = new Thread(runable2);
		thread2.start();
	}

}
