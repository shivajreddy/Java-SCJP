public class Main {
  public static void main(String[] args) {

    int x = 10;
    int octa_x = 010;
    int hex_x = 0x10;

    long big = 200l;

    short s = -32768;

    System.out.println(x + "..." + octa_x + "..." + hex_x);

    System.out.println(big);

    long l = 10;
    long l2 = 100L;


    float f = 123.456F;
    // float f_invalid = 123.456;
    double d = 0XFaCE0a99;
    float ff = 123.1f;
    System.out.println(d);

    System.out.println(Double.min(10,10));

//    float f2 = 123.1;

    double d2 = 1.23e3;
    System.out.println(d2);

    char letter = 253;
    System.out.println(letter);

    char ch = 'b';
    System.out.println(ch);

    char ch2 = '\u1971';
    System.out.println(ch2);

    char ch3 = '\u0062';
    System.out.println(ch3);

    char ch4 = '\t';
    System.out.println(ch3 +"."+ ch4+"." + ch3);
    System.out.println(ch3);

    char maxChar = 65535;
    System.out.println(maxChar);

    char s1 = '\udeef';
    System.out.println(s1);

    /* String Literal
    */
    String s2 = "shiva";
    String s3 = "\rshiva";


    double _num = 1______23;

    byte b1 = 10;

    float f1 = 10;
    String s4 = "reddy";

    char c7 = 120;

//    short s5 = c7;

    int[] arr1;
    int[] arr2 = new int[3];
    arr2[0] = 1;
//    System.out.println(arr1);

    int[] arr3;
    int []arr4;
    int arr5 [];

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