public class Main {

  public static void main(String[] args) {
//    Arr.meth();
    Person shiva = new Person();

    System.out.println(shiva.name);
    System.out.println(shiva.roll_number);

    System.out.println(Person.college_name);
    Person.college_name = "new college";
    System.out.println(Person.college_name);




//    Arr.meth();

//    System.out.println(sum(new int[]{10,10,100}));



  }

  public static int sum(int[] arr){
    int result = 0;
    for(int num : arr){
      result += num;
    }

    return result;
  }

    /* Reserved Keywords
    53
    50 - keywords
    3 - Reserved Literals (in other words value keywords) -> true, false, null

    data types - 8
    1st bit is sign. 1 means -ve, 0 means +ve.
    byte - 1 byte(8bits) -> -128,127. Range:2^7,2^7-1   2^6 + 2^5 + 2^4 2^3 + 2^2 + 2^1 -> 1st bit is sign, 7bits to represent value. Best suitable for streams(file and network)
    short - 2 bytes(16bits) -> rarely used. -> Range:-32768,32767 -> 1st bit is sign, 15bits to represent value
    int - 4 bytes(32bits)-> most common. -> Range:-2^31,2^31-1  or -2147483648,2147483647
    long - 8 bytes(64bits) -> -2^63,2^63-1
    float
    double
    char
    boolean

    flow control - 11
    if
    else
    switch
    case
    default
    for
    do
    while
    break
    continue
    return

    modifiers - 11
    public
    private
    protected
    static
    final
    abstract
    synchronized
    native
    strictfp
    transient
    volatile

    Exception handling - 6
    try
    catch
    throw
    throws
    finally
    assert (1.4 addition)

    Class related - 6
    class
    package
    import
    interface
    extends
    implements

    Object related - 4
    new
    instanceof
    super
    this

    Return type - 1
    void

    named constants - 1
    enum

    unused keywords - 2
    goto
    const

     */

}