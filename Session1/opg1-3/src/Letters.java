public class Letters implements Runnable
{
  private int numberOfLetters;

  public Letters(int numberOfLetters)
  {
    this.numberOfLetters = numberOfLetters;
  }

  @Override public void run()
  {
    while(true)
    {
      for (int i = 0; i < numberOfLetters; i++)
      {
        System.out.println((char) + (i + 97));
      }
    }
  }
}
