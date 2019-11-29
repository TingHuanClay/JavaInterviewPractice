package ThreadSafeDemo;

import java.util.List;

/**
 * Use synchronized to protect shared variables
 * */
public class ArrayListThread3Example implements Runnable {
	private List<String> list;
	
    public ArrayListThread3Example(List<String> list) {
        this.list = list;
    }

	@Override
	public void run() {
		for (int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
				// Use synchronized and block the section accessing the object
				synchronized(list) {
					this.list.add("a" + i);
				}
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
