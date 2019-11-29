package ProducerConsumerWithExchangerDemo;

import java.util.concurrent.Exchanger;

/**
 * Exchanger would be used for two threads to exchange some object value
 * Thread would be pending when there is no other thread to exchange with it.
 * 
 * It can be adopted in Producer-Consumer Pattern
 * 
 * In this case,
 * ProducerThread would append the value to the StringBuffer
 * and switch the StringBuffer with ConsumerThread
 * then ConsumerThread would have the STringBuffer produced by the producer
 * 
 * However, the program would be pending when there is only 1 thread,
 * but the a producer-consumer pair
 * to resolve this issue, we can add a queue just between the producer and consumer
 * */
public class ProducerConsumerThreadTest {

	public static void main(String[] args) {
		Exchanger<StringBuffer> exchanger = new Exchanger<StringBuffer>();
		
		ProducerThreadExample producer = new ProducerThreadExample(exchanger);
		Thread producerThread = new Thread(producer);
		
		ConsumerThreadExample consumer = new ConsumerThreadExample(exchanger);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();
		
		
	}

}
