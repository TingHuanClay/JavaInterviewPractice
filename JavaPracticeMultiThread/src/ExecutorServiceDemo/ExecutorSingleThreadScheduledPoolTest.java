package ExecutorServiceDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Only 1 thread would be initialized and executed
 * */
public class ExecutorSingleThreadScheduledPoolTest {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool = Executors.newSingleThreadScheduledExecutor();

		long lastTime = System.currentTimeMillis();
//		scheduledThreadPool.scheduleAtFixedRate(command, initialDelay, period, unit);
		scheduledThreadPool.scheduleAtFixedRate(new Thread4ScheduledExample(lastTime), 1, 5, TimeUnit.SECONDS);
		
	}


}
