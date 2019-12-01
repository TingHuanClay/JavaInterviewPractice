package ThreadFactoryDemo;

public class ThreadFactoryTest {

	public static void main(String[] args) {
		ThreadFactoryExample factory = new ThreadFactoryExample();

		Thread thread1 = factory.newThread(new ThreadExample("msg-1"));
		Thread thread2 = factory.newThread(new ThreadExample("msg-2"));
		Thread thread3 = factory.newThread(new ThreadExample("msg-3"));
		
		System.out.println("factory.getCount() = " + factory.getCount());
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
