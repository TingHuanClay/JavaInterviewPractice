package LinkedBlockingQueueDemo.Read;

import java.util.concurrent.LinkedBlockingQueue;

public class PollQueueExample {

	public static void main(String[] args) {
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
		
		queue.add("a1");
		queue.add("a2");
	    String element1 = queue.poll();
	    System.out.println(element1);
	    
	    String element2 = queue.poll();
	    System.out.println(element2);
	    
	    String element3 = queue.poll();
	    System.out.println(element3);
	}

}
