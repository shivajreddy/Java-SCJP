
/* Navigable Set
 *
 *
 * NavigableSet(I) methods:
 *          1. ceiling(e); -> lowest element which is >= e
 *          2. higher(e); -> lowest element which is > e
 *          3. floor(e);  -> highest element which is <= e
 *          4. lower(e); -> highest element which is < e
 *          5. pollFirst(); -> remove and return first element
 *          6. pollLast(); -> remove and return last element
 *          7. descendingSet(); -> returns NavigableSet in reverse order
 */

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) throws Exception {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1000);
        treeSet.add(2000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(5000);

        System.out.println("treeSet = " + treeSet); // [1000, 2000, 3000, 4000, 5000]

        System.out.println(treeSet.ceiling(2000));  // 2000
        System.out.println(treeSet.higher(2000));   // 3000
        System.out.println(treeSet.floor(3000));    // 3000
        System.out.println(treeSet.lower(3000));    // 2000
        System.out.println(treeSet.pollFirst());    // 1000
        System.out.println(treeSet.pollLast());     // 5000
        System.out.println(treeSet.descendingSet());    // [4000, 3000, 2000]

    }
}
