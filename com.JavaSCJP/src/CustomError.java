class TooOldException extends RuntimeException
{
  TooOldException(String errorMessage){}
}

class TooYoungException extends RuntimeException
{
  TooYoungException(String errorMessage){}

  void m1(){}
}