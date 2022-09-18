// Command Line arguments
package com.shiva.LearnJava;

public class Test {

  public static void main(String[] args){
    System.out.println("Running the main method");

    for(int i = 0; i <= args.length; i++){
      System.out.println("Passed arg is " + args[i]);
    }
  }

}
