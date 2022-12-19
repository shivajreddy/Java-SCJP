import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("s", -32);
        hashMap.put("h", 9);
        hashMap.put("i", 78);
        hashMap.put("v", 23);
        hashMap.put("a", 12);
        System.out.println("hashMap = " + hashMap); // {a=12, s=-32, v=23, h=9, i=78}

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("s", -32);
        linkedHashMap.put("h", 9);
        linkedHashMap.put("i", 78);
        linkedHashMap.put("v", 23);
        linkedHashMap.put("a", 12);
        System.out.println("linkedHashMap = " + linkedHashMap); // {s=-32, h=9, i=78, v=23, a=12}

    }
}


/* LinkedMap
 *
 * underlying data structure -> HashTable + LinkedList
 * insertion order is preserved, it is based on hash code of keys
 * LinkedHashSet, LinkedHashMap are generally used to develop memory-cache applications
 */
