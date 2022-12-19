import java.util.HashMap;
import java.util.WeakHashMap;

public class MapDemo {
    public static void main(String[] args) {


        HashMap<Temp, String> hashMap = new HashMap<>();
        Temp temp = new Temp();
        hashMap.put(temp, "durga");

        WeakHashMap<Temp, String> weakHashMap = new WeakHashMap<>();
        Temp weakTemp = new Temp();
        weakHashMap.put(weakTemp, "shiva");


        // setting the both objects to null, so that GC can destroy them
        temp = null;
        weakTemp = null;

        // before garbage collector destroys an object, it calls the clean-up methods of that object if any.
        System.gc();

        System.out.println("hashMap = " + hashMap);
        System.out.println("weakHashMap = " + weakHashMap);

    }
}


/* WeakHashMap
 *
 * Same as HashMap except these:
 *      In both HashMap & WeakHashMap a value object is not eligible for GC, thought it has no reference
 *      1. In HashMap a key object is not eligible for GC, even though it doesn't have any reference
 *      2. In WeakHashMap, if a key object is eligible for GC, if it has no reference
 */


class Temp {
    @Override
    public String toString() {
        return "temp";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method is called");
    }

}

