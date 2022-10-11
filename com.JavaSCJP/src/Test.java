public class Test
{
  public static void main(String[] args)
  {
    int givenAge;
    if (args.length > 0){
      givenAge = Integer.parseInt(args[0]);
      if (givenAge > 90){
        try{
          throw new TooYoungException("You are too young");
        } catch (TooYoungException e){
          System.out.println(e);
        System.out.println(e.toString());
        System.out.println(e.getMessage());
        }
      }
    }

  }
}

class TooYoungException extends RuntimeException
{
  private String errorMessage;
  TooYoungException(String errorMessage){
    this.errorMessage = errorMessage;
  }
  @Override
  public String getMessage(){
    return errorMessage;
  }
}
