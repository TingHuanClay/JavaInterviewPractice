package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadScheduledExecutor
 * */
public class ExecutorSingleThreadTest {
	public static void main(String[] args) {
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

		try {
			for (int i = 0; i < 5 ; i++) {
				singleThreadPool.execute(new ThreadExample() );
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			singleThreadPool.shutdown();
		}
	}


}
