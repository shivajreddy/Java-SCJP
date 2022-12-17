import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(15, new MyComparator());

        priorityQueue.offer("s");
        priorityQueue.offer("h");
        priorityQueue.offer("i");
        priorityQueue.offer("v");
        priorityQueue.offer("a");

        System.out.println("priorityQueue = " + priorityQueue);

    }
}


class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}