package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Once you use ExecutorService
 * it will try to find an 'Available' thread in the threadPool first,
 * but NOT directly create a new thread for the process
 * 
 * newFixThreadPool()
 * 
 * via leveraging ExecutorService, we can control the quantity of thread effectively
 * */
public class ExecutorFixedPoolTest {
	public static void main(String[] args) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

		try {
			for (int i = 0; i < 5 ; i++) {
				fixedThreadPool.execute(new ThreadExample() );
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			fixedThreadPool.shutdown();
		}
	}


}
