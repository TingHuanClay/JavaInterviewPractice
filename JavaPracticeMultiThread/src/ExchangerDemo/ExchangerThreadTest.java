package ExchangerDemo;

import java.util.concurrent.Exchanger;

/**
 * Exchanger would be used for two threads to exchange some object value
 * Thread would be pending when there is no other thread to exchange with it.
 * 
 * It can be adopted in Producer-Consumer Pattern
 * */
public class ExchangerThreadTest {

	public static void main(String[] args) {
		Exchanger exchanger = new Exchanger();
		
		ExchangerThreadExample exchangerThread1 =
				new ExchangerThreadExample(exchanger, "thread1", "msg1");
		Thread thread1 = new Thread(exchangerThread1);
		thread1.start();
		
		ExchangerThreadExample exchangerThread2 =
				new ExchangerThreadExample(exchanger, "thread2", "msg2");
		Thread thread2 = new Thread(exchangerThread2);
		thread2.start();
		
		
	}

}
