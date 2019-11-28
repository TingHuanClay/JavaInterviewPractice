
public class SumThread1Test {
	public static void main(String args[]) {
		SumThread1 sumThread = new SumThread1();
		Thread thread = new Thread(sumThread);
		thread.start();
        int result = sumThread.sum;
        
        System.out.println("Count result is:" + result);
        /*
         * Output:
         * 		Count result is:0 
         * we get sum before the loop in the run()
         * which is not we expected,
         * but we can use wait
         * */
	}
}
