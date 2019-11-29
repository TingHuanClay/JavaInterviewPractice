package LinkedBlockingQueueDemo.Check;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Check the first element and return 'null' 
 * when the LinkedBlockingQueue is Empty 
 * */
public class PeekQueueExample {

	public static void main(String[] args) {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		
		queue.add("a1");
	    String element1 = queue.peek();
	    System.out.println(element1);
	    
	    String element2 = queue.peek();
	    System.out.println(element2);
	    
	    queue.remove();
	    String element3 = queue.peek();
	    System.out.println(element3);
	}

}
