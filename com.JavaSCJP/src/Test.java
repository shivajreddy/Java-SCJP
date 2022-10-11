public class Test
{
  public static void main(String[] args)
  {

    // at this point there is 1 thread -> main thread
    MyThread t = new MyThread();      // This is called "Thread initialization"

    t.start();      // Starting this child thread -> "Starting a Thread"

    // at this point there are 2 threads -> main thread, t thread (which we just created & started)
    // from now on, all the jobs in both the threads above will execute simultaneously. we will mixed output

    for (int i = 0; i < 10; i++){
      System.out.println("main thread. task: " + i);
    }

  }

}

