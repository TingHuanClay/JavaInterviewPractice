
public class SumThread2 implements Runnable{
	int sum = 0;
	
	@Override
	public void run() {
		synchronized(this) {
			for (int i = 0 ; i < 100 ; i++) {
				sum += i;
			}
			notify();
		}
	}
}
