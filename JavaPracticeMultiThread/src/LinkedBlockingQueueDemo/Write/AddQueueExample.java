package LinkedBlockingQueueDemo.Write;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * There will be an exception happened the adding an object to a queue which is full 
 * */
public class AddQueueExample {

	public static void main(String[] args) {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(2);

		boolean a1 = queue.add("a1");
		System.out.println("a1: " + a1);
		
		boolean a2 = queue.add("a2");
		System.out.println("a2: " + a2);
		
		boolean a3 = queue.add("a3");
		System.out.println("a3: " + a3);
	}

}
