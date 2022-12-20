import java.util.Comparator;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        TreeMap<Object, Object> treeMap = new TreeMap<>();
        treeMap.put(100, "zzz");
        treeMap.put(103, "yyy");
        treeMap.put(101, "xxx");
        treeMap.put(104, 777);
        System.out.println("treeMap = " + treeMap); // {100=zzz, 101=xxx, 103=yyy, 104=777}

        TreeMap<Object, Object> treeMap2 = new TreeMap<>(new MyComparator());
        treeMap2.put(100, "zzz");
        treeMap2.put(103, "yyy");
        treeMap2.put(101, "xxx");
        treeMap2.put(104, 777);
        System.out.println("treeMap2 = " + treeMap2); // {104=777, 103=yyy, 101=xxx, 100=zzz}
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        int newNum = (int) o1;
        int oldNum = (int) o2;

        if (newNum < oldNum) {
            return 1;
        } else if (newNum > oldNum) {
            return -1;
        }
        return 0;
    }
}


/* TreeMap
 *
 * underlying data-structure -> RED-BLACK tree
 * group of k-v pairs, according to some sorting order of keys
 * duplicate keys not allowed, insertion order is not preserved
 *
 * Keys:
 *      For Default sorting natural order i.e., Comparable(I) -> only homogeneous
 *      For Custom sorting order i.e,. Comparator(I) -> heterogeneous
 * values: heterogeneous like any other hashmap
 * null can't be used as key
 *
 *
 * Constructors:
 *          1. TreeMap = new TreeMap(); -> default sorting order
 *          2. TreeMap = new TreeMap(Comparator c); -> customized sorting order
 *          3. TreeMap = new TreeMap(SortedMap m); -> given sorted map, create a new tree map
 *          4. TreeMap = new TreeMap(Map m); -> given any map, create a new tree map
 *
 *
 * SortedMap(I) defines these 6 specific methods:
 *          1. Object firstKey();
 *          2. Object lastKey();
 *          3. SortedMap headMap(Object key);
 *          4. SortedMap tailMap(Object key);
 *          5. SortedMap subMap(Object key1, Object key2);
 *          6. Comparator c = sortedMap.comparator();
 *
 *          Example: TreeMap<Integer, String> treeMap = new TreeMap<>();
 *          treemap -> { 101:A, 103:B, 104:C, 107:D, 125:E, 136:F }
 *          treeMap.firstKey(); // 101
 *          treeMap.lastKey(); // 136
 *          treeMap.headMap(107); // {101:A, 103:B, 104:C}
 *          treeMap.tailMap(107); // {107:D, 125:E, 136:F}
 *          treeMap.subMap(103, 125); // {103:B, 104:C, 107:D, 125:E}
 *          treeMap.comparator(); // null
 */


