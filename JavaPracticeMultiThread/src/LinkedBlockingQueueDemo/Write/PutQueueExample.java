package LinkedBlockingQueueDemo.Write;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * It will be pending when execute put() on an Full LinkedBlockingQueue
 * */
public class PutQueueExample {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(2);

		queue.put("a1");
		System.out.println("put a1 ");
		
		queue.put("a2");
		System.out.println("put a2");
		
		queue.put("a3");
		System.out.println("put a3");
	}

}
