import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        /* Set
         *
         * Set(I) has no new methods, we have to use only Collection(I) methods
         */

        /* HashSet
         *
         * underlying data structure is -> HashTable
         * duplicates not allowed, order is not preserved
         * every object is inserted into the HashSet -> based on hash code -> created using hashing funciton
         * heterogeneous objects
         * Serializable(I), Cloneable(I)
         * HashSet is the best choice for search operation
         *
         * constructor:
         *      HashSet<?> hashSet = new HashSet<>();
         *          Default Fill Ratio : 0.75
         *              Fill Ratio also known as LoadFactor
         *              Fill Ratio -> after fill 75% create the next size of this data structure
         *              for ArrayList -> default fill ratio is 60% -> (size * 3/2 ) + 1
         *      HashSet<?> hashSet = new HashSet<>(int defaultSize);
         *      HashSet<?> hashSet = new HashSet<>(int defaultSize, float fillRatio);
         *      HashSet<?> hashset = new HashSet<>(Collection c);
         */

        HashSet<Object> hashSet = new HashSet<>(1);

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add("shiva");
        hashSet.add("shiva");
        hashSet.add(null);

        // System.out.println("hashSet =       " + hashSet);

        /* LinkedHashSet
         *
         * underlying data structure -> HashTable + LinkedList
         * duplicates not allowed, order is preserved
         * LinkedHashSet is mainly used in developing cache based applications, where
         *      duplicates are not allowed, and insertion order must be preserved
         */

        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>(1);

        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add("shiva");
        linkedHashSet.add("shiva");
        linkedHashSet.add(null);

        // System.out.println("linkedHashSet = " + linkedHashSet);

        /* SortedSet
         *
         * a collection of unique objects, inserted in some sorting order
         * 6 specific methods for SortedSet
         * Methods: SortedSet<> sortedSet = new SortedSet<>();
         *          1. Object firstElement = sortedSet.first();
         *          2. Object lastElement = sortedSet.last();
         *          3. SortedSet set<o = sortedSet.headSet(Object o);
         *          4. SortedSet set>=o = sortedSet.tailSet(Object o);
         *          5. SortedSet set>=o1_and<=o2 = sortedSet.subSet(Object o1, Object o2);
         *          6. Comparator comparator = sortedSet.comparator();
         *                  default sorting order returns null
         *                  For numbers, default sorting order -> Ascending order
         *                  For Strings, default sorting order -> alphabetical order
         */



        /* TreeSet
         *
         * underlying data-structure -> Balanced Tree
         * Duplicates not allowed, insertion order not preserved
         * only homogeneous. if you add heterogeneous objects -> ClassCastException
         * can't insert null
         * a collection of unique objects, inserted in some sorting order
         *
         * Constructors:
         *          1. TreeSet<?> treeSet = new TreeSet<>(); -> default natural sorting order
         *             the objects in this case should implement comparable
         *          2. TreeSet<?> treeSet = new TreeSet<>(Comparator c); -> customized sorting order
         *          3. TreeSet<?> treeSet = new TreeSet<>(Collection c); -> default natural sorting order
         *          4. TreeSet<?> treeSet = new TreeSet<>(SortedSet s); -> sorting order of s applies to treeSet
         */


        // TreeSet<Object> treeSet = new TreeSet<>();
        // treeSet.add("A");   // unicode of A = 41
        // treeSet.add("a");   // unicode of a = 61
        // treeSet.add("Z");
        // treeSet.add("L");

        // System.out.println("treeSet = " + treeSet); // [A, L, Z, a]

        // TreeSet<StringBuffer> ts = new TreeSet<>();
        // ts.add(new StringBuffer("A"));
        // ts.add(new StringBuffer("Z"));
        // ts.add(new StringBuffer("L"));
        // ts.add(new StringBuffer("B"));
        // System.out.println("ts = " + ts);




    }
}
