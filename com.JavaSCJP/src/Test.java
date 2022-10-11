public class Test
{
  public static void main(String[] args)
  {
    int givenAge = Integer.parseInt(args[0]);

    if (givenAge > 90){
      throw new TooYoungException("You are too young, please wait some more time, definitely you will get best match");
    }
  }
}
