public class Hello implements Runnable
{
  @Override public void run()
  {
    while (true)
    {
      for (int i = 0; i <= 1000; i++)
      {
        System.out.println("hello");
      }
    }
  }
}
