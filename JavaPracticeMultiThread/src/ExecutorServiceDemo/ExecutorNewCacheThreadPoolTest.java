package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Once you use ExecutorService
 * it will try to find an 'Available' thread in the threadPool first,
 * but NOT directly create a new thread for the process
 * 
 * newCacheThreadPool()
 * 
 * via leveraging ExecutorService, we can control the quantity of thread effectively
 * */
public class ExecutorNewCacheThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newCachedThreadPool();

		System.out.println("========= executeThread 'With' Sleep =========");
		executeThreadWithSleep(threadPool);
		
		System.out.println("========= executeThread 'WithOut' Sleep =========");
		executeThreadWithOutSleep(threadPool);
		
		threadPool.shutdown();
	}

	private static void executeThreadWithOutSleep(ExecutorService threadPool) {
		try {
			for (int i = 0; i < 5 ; i++) {
				threadPool.execute(new ThreadExample() );
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void executeThreadWithSleep(ExecutorService threadPool) {
		/**
		 * Output:
		 *  run pool-1-thread-1 thread
			run pool-1-thread-1 thread
			run pool-1-thread-1 thread
			run pool-1-thread-1 thread
			run pool-1-thread-1 thread
		 * */
		try {
			for (int i = 0; i < 5 ; i++) {
				Thread.sleep(1000);
				threadPool.execute(new ThreadExample() );
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
