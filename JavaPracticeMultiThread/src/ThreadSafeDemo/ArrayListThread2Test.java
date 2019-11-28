package ThreadSafeDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListThread2Test {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Use Collections.synchronizedList to make sure the shared variable is thread-safe
		 * */
		List<String> ls = Collections.synchronizedList(new ArrayList<String>());

		/*
		 * following threads share the same ArrayList
		 * */
		Thread thread1 = new Thread(new ArrayListThread1Example(ls));
		Thread thread2 = new Thread(new ArrayListThread1Example(ls));
		Thread thread3 = new Thread(new ArrayListThread1Example(ls));
		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		thread2.join();
		thread3.join();
		System.out.println("ls size is: " + ls.size());
		/*
		 * Output:
		 * 		ls size is: 30
		 * 
		 * This is correct result of the thread safe
		 * */
	}

}
