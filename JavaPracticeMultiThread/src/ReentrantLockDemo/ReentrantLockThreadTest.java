package ReentrantLockDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		List<String> list = new ArrayList<String>();
//		ReentrantLockThreadExample reentrantLockThreadExample =
//				new ReentrantLockThreadExample(lock, list);
//		
//		Thread thread1 = new Thread(reentrantLockThreadExample);
//		Thread thread2 = new Thread(reentrantLockThreadExample);
//		Thread thread3 = new Thread(reentrantLockThreadExample);
		
		Thread thread1 = new Thread(new ReentrantLockThreadExample("thread1", lock, list));
		Thread thread2 = new Thread(new ReentrantLockThreadExample("thread2", lock, list));
		Thread thread3 = new Thread(new ReentrantLockThreadExample("thread3", lock, list));

		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		thread2.join();
		thread3.join();
		
		System.out.println("list.size() = " + list.size());
	}

}
