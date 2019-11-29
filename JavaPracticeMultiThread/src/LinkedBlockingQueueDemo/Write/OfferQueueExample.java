package LinkedBlockingQueueDemo.Write;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * It will return false without exception
 * when offering an object to a queue which is full 
 * */
public class OfferQueueExample {

	public static void main(String[] args) {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(2);
        
        boolean a1 = queue.offer("a1");
		System.out.println("a1: " + a1);
		
		boolean a2 = queue.offer("a2");
		System.out.println("a2: " + a2);
		
		boolean a3 = queue.offer("a3");
		System.out.println("a3: " + a3);
	}

}
