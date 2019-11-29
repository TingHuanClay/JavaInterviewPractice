package CopyOnWriteArrayListDemo;

import java.util.List;

public class ThreadExample implements Runnable {
  private List<String> list;

  public ThreadExample(List<String> list) {
    this.list = list;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        list.add("b" + i);
      }
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}