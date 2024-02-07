public class Numbers implements Runnable
{
  private int numberOfNumbers;

  public Numbers(int numberOfNumbers)
  {
    this.numberOfNumbers = numberOfNumbers;
  }

  @Override public void run()
  {
    while (true)
    {for (int i = 0; i < numberOfNumbers; i++)
    {
      System.out.println(i);
    }
    }
  }
}
