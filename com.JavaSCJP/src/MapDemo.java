import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        Integer x = new Integer(10);
        Integer y = new Integer(10);

        hashMap.put(x, "shiva");
        hashMap.put(y, "reddy");

        System.out.println(hashMap); // {10=reddy}


        IdentityHashMap identityHashMap = new IdentityHashMap();

        identityHashMap.put(x, "shiva");
        identityHashMap.put(y, "reddy");

        System.out.println(identityHashMap); // {10=shiva, 10=reddy}


    }
}


/* IdentityHashMap
 *
 * same as HashMap except:
 *      1. for HashMap, JVM will use .equals() i.e., content comparison
 *      2. but for IdentityHashMap, JVM will use == i.e., reference comparison
 */
