package CopyOnWriteArrayListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Since ArrayList is Not a Thread-safe collection
 * You will face runtime exception risk and received the exception below
 * 
	Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at CopyOnWriteArrayListDemo.ArrayListThreadUnSafeDemo.main(ArrayListThreadUnSafeDemo.java:22)
 * */
public class ThreadUnSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * following threads share the same ArrayList
		 * */
		List<String> ls = new ArrayList<String>();
		ls.add("a1");
		ls.add("a2");
		ls.add("a3");
		ls.add("a4");
		ls.add("a5");
		ls.add("a6");
		
		Thread thread = new Thread(new ThreadExample(ls));
	    thread.start();
	    for (String s: ls) {
	        System.out.println(s);
	    }
	}

}
