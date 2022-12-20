
/* NavigableSet(I)
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

import java.util.TreeMap;
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

/* NavigableMap(I)
 *
 * NavigableMap(I) methods:
 *          1. ceilingKey(key); -> lowest pair whose key is >= e
 *          2. higherKey(e); -> lowest pair whose key is > e
 *          3. floorKey(e);  -> highest pair whose key is <= e
 *          4. lowerKey(e); -> highest pair whose key is < e
 *          5. pollFirstEntry(); -> remove and return first pair
 *          6. pollLastEntry(); -> remove and return last pair
 *          7. descendingMap(); -> returns NavigableMap in reverse order
 */

class NavigableMapDemo {
    public static void main(String[] args) {

        TreeMap<String, String> treemap = new TreeMap<>();

        treemap.put("b", "banana");
        treemap.put("c", "cat");
        treemap.put("a", "apple");
        treemap.put("d", "dog");
        treemap.put("g", "gun");

        System.out.println("treemap = " + treemap);


    }
}
