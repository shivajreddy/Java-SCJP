import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {


        /* Queue
         *
         * First in First out -> FIFO
         * constructor Queue<?> queue = new Queue<>();
         * queue.offer(Object o) -> adds o to the queue
         * queue.peek() -> return head of queue, if no head return null
         * queue.poll() -> remove and return head. if no head return null
         * queue.element() ->  return head. if no head R.E
         * queue.remove() -> remove and return head. if no head R.E
         */


        /* Priority Queue
         *
         * Represent a group of individual objects prior to processing, according to some priority.
         * priority order -> can be default sorting -> Comparable(I) or customized comparator -> Comparator(I)
         * if using default sorting, then only homogeneous elements else ClassCastException
         * if using custom sorting, can be heterogeneous elements
         * Null is not allowed, even as the first element
         * constructor:
         *      PriorityQueue<?> pq = new PriorityQueue<>(); -> default size
         *      PriorityQueue<?> pq = new PriorityQueue<>(int initialCapacity);
         *      PriorityQueue<?> pq = new PriorityQueue<>(int initialCapacity, Comparator c);
         *      PriorityQueue<?> pq = new PriorityQueue<>(SortedSet s);
         *      PriorityQueue<?> pq = new PriorityQueue<>(Collection c);
         */

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(i);
        }
        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);


    }
}

