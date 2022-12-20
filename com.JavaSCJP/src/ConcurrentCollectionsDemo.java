
/* Concurrent Collections
 *
 */


import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentCollectionsDemo {
    public static void main(String[] args) throws Exception {

        ArrayList arrayList = MyThread.arrayList;

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        MyThread thread = new MyThread();
        thread.start();

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Main Thread. current object is" + iterator.next());
            Thread.sleep(3000);
        }
        // System.out.println();

    }
}


class MyThread extends Thread {

    static ArrayList<Object> arrayList = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("child thread updating");
        arrayList.add(777);
    }
}

