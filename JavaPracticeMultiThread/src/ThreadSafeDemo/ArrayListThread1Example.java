package ThreadSafeDemo;

import java.util.List;

public class ArrayListThread1Example implements Runnable {
	private List<String> list;
	
    public ArrayListThread1Example(List<String> list) {
        this.list = list;
    }

	@Override
	public void run() {
		for (int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
				this.list.add("a" + i);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
