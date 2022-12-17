import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(15, new MyComparator());

        priorityQueue.offer(12);
        priorityQueue.offer(7);
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(8);

        // System.out.println("priorityQueue = " + priorityQueue);

        PriorityQueue<String> pq = new PriorityQueue<>(15, new MyComparator2());
        pq.offer("A");
        pq.offer("Z");
        pq.offer("L");
        pq.offer("B");
        pq.offer("A");
        pq.offer("B");
        pq.offer("B");

        System.out.println("pq = " + pq);

    }
}


class MyComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        int x = (int) o1;
        int y = (int) o2;

        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1;
        }
        return -1;
    }
}

class MyComparator2 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.compareTo(s2);
    }
}