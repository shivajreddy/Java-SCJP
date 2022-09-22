public class StaticImport
{

  /* Awesome features introduced in 1.5

  1. for-each loop -> for(int x : arr)
  2. var-arg methods ->
  3. Auto boxing and Auto un-boxing
  4. Generics
  5. co-variant return type
  6. Queue data structure
  7. Annotation
  8. enum
  9. Static import      // This is not at all recommended. its a flop concept
  10. String builder

   */


  public static void main(String[] args)
  {
    // With-out static import
    StaticImport.withOutStaticImport();
  }


  public static void withOutStaticImport(){
    System.out.println(Math.sqrt(20));
    System.out.println(Math.random());
  }

  public static void withStaticImport()
  {
    /* With static import

    import static java.lang.math.*;

     */

  }



