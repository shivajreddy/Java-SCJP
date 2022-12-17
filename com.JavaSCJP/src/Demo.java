import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println("arr = " + arr);

        // Cursor 2 : Iterator -> Universal cursor
        Iterator<?> iterator = arr.iterator();
        System.out.println(iterator.getClass().getName());

        System.out.println(iterator);

        while (iterator.hasNext()) {
            // iterator.next() returns the object at current position, and moves the cursor forward
            int i = (int) iterator.next();
            if (i % 2 == 0) {
                System.out.println(i);
                iterator.remove();
            }
        }

        System.out.println("Final arr =" + arr);

    }
}
