package CopyOnWriteArrayListDemo;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList is a Thread-safe collection
 * What you have to do is change the Arraylist to CopyOnWriteArrayList 
 * to make sure thread-safe
 * 
 * 用槍時機:
 * 	想減少使用synchronized 的次數 來解performance
 * 	Lsit 的讀取次數 比 寫入的次數還多
 *  寫入的資料也少(表示不需要大量的Copy) 
 * */
public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * following threads share the same ArrayList
		 * */
		CopyOnWriteArrayList<String> ls = new CopyOnWriteArrayList<String>();
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
