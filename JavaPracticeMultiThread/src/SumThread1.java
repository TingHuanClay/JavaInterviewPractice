
public class SumThread1 implements Runnable{
	int sum = 0;
	
	@Override
	public void run() {
		for (int i = 0 ; i < 100 ; i++) {
			sum += i;
		}
	}
}
