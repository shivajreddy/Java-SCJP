import java.util.HashMap;
import java.util.List;

public class MyThread extends Thread {

  static Thread mt;


  @Override
  public void run() {

    try
      {
      mt.join();
      } catch (InterruptedException e)
      {
      System.out.println(e);
      }

    for (int i = 0; i < 10; i++)
      {
      System.out.println("child thread");
      }

    String n = "shiva";

  }

}
