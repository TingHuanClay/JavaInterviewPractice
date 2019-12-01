package ExecutorServiceDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * scheduleAtFixedRate 是固定的每隔 5 秒印出字串
 * scheduleWithFixedDelay 方法是一定要等待上個執行緒執行完成之後才會往下繼續執行。
 * */
public class ExecutorScheduledThreadPoolTest {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

		long lastTime = System.currentTimeMillis();
//		scheduledThreadPool.scheduleAtFixedRate(command, initialDelay, period, unit);
//		scheduledThreadPool.scheduleAtFixedRate(new Thread4ScheduledExample(lastTime), 1, 5, TimeUnit.SECONDS);
		
		scheduledThreadPool.scheduleWithFixedDelay(new Thread4ScheduledExample(lastTime), 1, 5, TimeUnit.SECONDS);
	}


}
