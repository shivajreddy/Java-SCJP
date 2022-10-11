public class Test
{
  public static void main(String[] args)
  {
    int givenAge = Integer.parseInt(args[0]);
    if (givenAge >= 90){
      throw new TooYoungException("You are too young cuz given : " + givenAge);
    } else if (givenAge <= 18) {
      throw new TooOldException("you are underage");
    }

  }
}

class TooOldException extends RuntimeException
{
  private String errorMessage;
  TooOldException(String errorMessage){
    this.errorMessage = errorMessage;
  }

  @Override
  public String getMessage(){
    return errorMessage;
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
