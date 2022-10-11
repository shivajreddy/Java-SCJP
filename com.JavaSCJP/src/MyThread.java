// Defining a thread
public class MyThread extends Thread {

  @Override
  public void run(){      // what ever is in the body of run(), it's the called 'job' of the thread
    for (int i = 0; i < 10; i++){
      System.out.println("child thread. task: " + i);
    }
  }

}

