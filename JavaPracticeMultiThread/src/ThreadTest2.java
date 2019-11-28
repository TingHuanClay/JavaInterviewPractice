
public class ThreadTest2 {
	public static void main(String args[]) {
		Thread thread1  = new Thread( new ThreadExample2("message 1"));
		Thread thread2  = new Thread( new ThreadExample2("message 2"));
		Thread thread3  = new Thread( new ThreadExample2("message 3"));
		Thread thread4  = new Thread( new ThreadExample2("message 4"));
		Thread thread5  = new Thread( new ThreadExample2("message 5"));
		Thread thread6  = new Thread( new ThreadExample2("message 6"));
		Thread thread7  = new Thread( new ThreadExample2("message 7"));
		Thread thread8  = new Thread( new ThreadExample2("message 8"));
		Thread thread9  = new Thread( new ThreadExample2("message 9"));
		Thread thread10 = new Thread( new ThreadExample2("message 10"));

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
		 * Which is In expected sequence
				Thread Message: message 1
				Thread Message: message 3
				Thread Message: message 4
				Thread Message: message 2
				Thread Message: message 5
				Thread Message: message 6
				Thread Message: message 9
				Thread Message: message 7
				Thread Message: message 8
				Thread Message: message 10
		 * */
	}
}
