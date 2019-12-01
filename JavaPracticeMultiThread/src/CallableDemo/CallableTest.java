package CallableDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * You have to use ExecutorService & FutureTask
 * to initialize a thread when it implements a Callable interface
 * */
public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableExample callable1 = new CallableExample("MSG-1", 1000L);
		CallableExample callable2 = new CallableExample("MSG-2", 2000L);

		FutureTask<String> futuretask1 = new FutureTask(callable1);
		FutureTask<String> futuretask2 = new FutureTask(callable2);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(futuretask1);
		es.execute(futuretask2);

		System.out.println(futuretask1.get());
		System.out.println(futuretask2.get());
	}

}
