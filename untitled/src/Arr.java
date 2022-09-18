import java.util.Arrays;

public class Arr {
  /* What is an array?
  Array is an indexed collection of fixed number of homogeneous data types
   */


  public static void meth(){

    int[] maxArr = new int[204048314];

//    System.out.println(maxArr);


    int[] x = new int[21];

    boolean[] barr = new boolean[10];
//    System.out.println(barr.getClass().getName());

    char []chararr = new char[10];
//    System.out.println(chararr.getClass().getName());


//     you can create an array with size 0 in java
    int[] zeroArr = new int[0];
//    System.out.println(zeroArr.getClass().getName());

//     System.out.println(negArr.getClass().getName());

    int[] arr1 = new int[3];
    System.out.println(arr1);
    System.out.println(arr1[0]);


    System.out.println("---");

    int[][] arr2 = new int[3][2];
    System.out.println(arr2);
    System.out.println(arr2[0]);
    System.out.println(arr2[0][0]);
    System.out.println("---");


//    int[] arr3 = new int[2147483647];
//    int[] arr4 = new int[2147483648];

    int[][][] arr = new int[3][][];
    System.out.println(arr[0]);
//    System.out.println(arr[0][0]);
    arr[0] = new int[3][];

    arr[0][0] = new int[1];


    int[] arr5 = new int[3];
    for (int item : arr5) {
      System.out.println(item);
    }
    int count = 1;
    for (int i = 0; i < arr5.length; i++) {
      arr5[i] = count;
      count += 1;
    }

    for (int item : arr5) {
      System.out.println(item);
    }

    int[][] arr6 = {{1,2,3}, {4,5,6}};
    System.out.println(arr6);
    System.out.println(arr6[0]);
    System.out.println(arr6[1]);
    System.out.println(arr6[0][2]);
//    System.out.println(arr6[0][3]);

    int[] arr7 = new int[2];
    System.out.println(arr7.length);

    int[] basic_arr = new int[3];
    int[] single_line_arr = new int[]{10,20,30};
    int[] anonymous_arr = new int[]{10,20};

    Object[] o1 = new Object[3];

    o1[0] = new String("shiva");
    o1[1] = new int[]{1,2,3};

    System.out.println(o1);
    System.out.println(o1[0]);
    System.out.println(o1[1]);
    System.out.println(o1[2]);

//    Create an array of interfaces. Runnable interface

    char[] carr = {99, 99};

    int[] iarr = {1,2,3};
    System.out.println(carr + "." + iarr);

    System.out.println(new boolean[]{});
    System.out.println(new byte[]{});

    String[] sarr = {"shiva", "reddy"};
    Object[] oarr = {"shiva", "q"};
    System.out.println("sarr = " + sarr);
    System.out.println("oarr = " + oarr);



    int[][] p = new int[3][2];
    p[0] = new int[2];
    p[1] = new int[10];
    System.out.println(p.length);
    System.out.println(p[0].length);
    System.out.println(p[1].length);


  }



}
