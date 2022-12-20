
/* Queue
 *
 *
 */


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class QueueDemo {
    public static void main(String[] args) throws Exception {


        PriorityQueue<Object> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        System.out.println("priorityQueue=" + priorityQueue);

        TreeSet<Object> treeSet = new TreeSet<>(new MyComparator());

        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);

        System.out.println("treeSet=" + treeSet);


        PriorityQueue<Object> priorityQueue1 = new PriorityQueue<>(treeSet);
        System.out.println("priorityQueue1=" + priorityQueue1);

    }
}


class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int newObject = (int) o1;
        int oldObject = (int) o2;
        if (newObject > oldObject) {
            return -1;
        } else if (newObject < oldObject) {
            return 1;
        }
        return 0;
    }

}