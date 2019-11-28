
public class ThreadTest1 {
	public static void main(String args[]) {
		ThreadExample1 thread1  = new ThreadExample1("message 1");
		ThreadExample1 thread2  = new ThreadExample1("message 2");
		ThreadExample1 thread3  = new ThreadExample1("message 3");
		ThreadExample1 thread4  = new ThreadExample1("message 4");
		ThreadExample1 thread5  = new ThreadExample1("message 5");
		ThreadExample1 thread6  = new ThreadExample1("message 6");
		ThreadExample1 thread7  = new ThreadExample1("message 7");
		ThreadExample1 thread8  = new ThreadExample1("message 8");
		ThreadExample1 thread9  = new ThreadExample1("message 9");
		ThreadExample1 thread10 = new ThreadExample1("message 10");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		/*
		 * Output as Below
		 * Which is not in expected sequence
			Thread Message: message 2
			Thread Message: message 3
			Thread Message: message 1
			Thread Message: message 4
			Thread Message: message 5
			Thread Message: message 6
			Thread Message: message 7
			Thread Message: message 8
			Thread Message: message 9
			Thread Message: message 10
		 * */
	}
}
