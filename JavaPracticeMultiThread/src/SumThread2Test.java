
public class SumThread2Test {
	public static void main(String args[]) throws InterruptedException {
		SumThread2 sumThread = new SumThread2();
		Thread thread = new Thread(sumThread);
		thread.start();
		synchronized(thread) {
			thread.wait();
		}
        int result = sumThread.sum;
        
        System.out.println("Count result is:" + result);
        /*
         * Output:
         * 		Count result is:4950
         * we use 'wait()' & 'notify()' to make sure main thread would wait 
         * until the thread finished its job
         * */
	}
}
