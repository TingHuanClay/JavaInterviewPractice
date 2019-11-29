package SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class ThreadWithSemaphoreTest {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);
		Thread thread1 = new Thread( new ThreadWithSemaphoreExample("thread 1", semaphore));
		thread1.start();
		
		Thread thread2 = new Thread( new ThreadWithSemaphoreExample("thread 2", semaphore));
		thread2.start();
		
		Thread thread3 = new Thread( new ThreadWithSemaphoreExample("thread 3", semaphore));
		thread3.start();
		
		Thread thread4 = new Thread( new ThreadWithSemaphoreExample("thread 4", semaphore));
		thread4.start();
		
		Thread thread5 = new Thread( new ThreadWithSemaphoreExample("thread 5", semaphore));
		thread5.start();
		
		Thread thread6 = new Thread( new ThreadWithSemaphoreExample("thread 6", semaphore));
		thread6.start();
		
		Thread thread7 = new Thread( new ThreadWithSemaphoreExample("thread 7", semaphore));
		thread7.start();
		
	}

}
