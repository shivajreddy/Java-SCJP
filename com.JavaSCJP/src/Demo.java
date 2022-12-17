import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Demo {
    public static void main(String[] args) {

        /*
         * List
         */
        List<?> al = new ArrayList<>();
        ArrayList<?> arrayList = new ArrayList<>();
        List<?> ll = new LinkedList<>();
        LinkedList<?> linkedList = new LinkedList<>();

        List<?> v = new Vector<>();
        Vector<?> vector = new Vector<>();
        Vector<?> stack = new Stack<>();

        /*
         *  Set
         */
        Set<?> set = new HashSet<>();
        HashSet<?> hashSet = new HashSet<>();
        HashSet<?> lhs = new LinkedHashSet<>();
        LinkedHashSet<?> linkedHashSet = new LinkedHashSet<>();
        Set<?> ts = new TreeSet<>();
        SortedSet<?> ts1 = new TreeSet();


        /*
         * Queue
         */
        Queue<?> pq = new PriorityQueue();
        PriorityQueue<?> priorityQueue = new PriorityQueue<>();

        Queue<?> pbq1 = new PriorityQueue<>();
        BlockingQueue<?> pbq = new PriorityBlockingQueue<>();
        PriorityBlockingQueue<?> priorityBlockingQueue = new PriorityBlockingQueue<>();
        LinkedBlockingQueue<?> linkedBlockingQueue = new LinkedBlockingQueue<>();


        /*
         * Map
         */
        Map<?, ?> m = new HashMap<>();
        HashMap<?, ?> hashMap = new HashMap<>();
        HashMap<?, ?> lhm = new LinkedHashMap<>();
        LinkedHashMap<?, ?> linkedHashMap = new LinkedHashMap<>();

        Map<?, ?> whm = new WeakHashMap<>();
        WeakHashMap<?, ?> weakHashMap = new WeakHashMap<>();

        Map<?, ?> ihm = new IdentityHashMap<>();
        IdentityHashMap<?, ?> identityHashMap = new IdentityHashMap<>();

        Map<?, ?> tm = new TreeMap<>();
        SortedMap<?, ?> stm = new TreeMap<>();
        NavigableMap<?, ?> ntm = new TreeMap<>();
        TreeMap<?, ?> treeMap = new TreeMap<>();

        Map<?, ?> dict = new Properties();
        Dictionary<?, ?> dProperties = new Properties();
        Properties properties = new Properties();



    }
}

