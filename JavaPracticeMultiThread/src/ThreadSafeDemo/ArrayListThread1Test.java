package ThreadSafeDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListThread1Test {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * following threads share the same ArrayList
		 * */
		List<String> ls = new ArrayList<String>();
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
	}

}
