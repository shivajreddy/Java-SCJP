
/* Array to List
 *
 *
 * For converting a List into Array -> Object[] array = collection.toArray();
 *
 * public static List asList(Object[] array);
 *      For converting Array to List -> List l = List.asList(Object[] array);
 *      This method is not creating a new list, it's showing(viewing) the array as a list
 *
 *      1.
 *      By using Array reference if we perform any changes in the array, those changes will reflect in list also.
 *      By using List reference if we perform any changes in the array, those changes will reflect in array also.
 *      Because both references are pointing to same object.
 *      2.
 *      BUT, if we perform any operation using the list reference to changes the size, that is not possible
 *          we will get R.E:UnsupportedOperationException
 *      Other operations that won't affect the array size, can still be used. ex: list.set(1, "new");
 *      3.
 *      By using list reference if we bring in heterogeneous element, we will get R.E:ArrayStoreException
 *
 */


public class CollectionsDemo {
    public static void main(String[] args) throws Exception {

    }
}


