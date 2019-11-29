package LinkedBlockingQueueDemo.Read;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * It will be pending when execute take() on an Empty LinkedBlockingQueue
 * */
public class TakeQueueExample {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		
		queue.add("a1");
		queue.add("a2");
	    String element1 = queue.take();
	    System.out.println(element1);
	    
	    String element2 = queue.take();
	    System.out.println(element2);
	    
	    String element3 = queue.take();
	    System.out.println(element3);
	}

}
