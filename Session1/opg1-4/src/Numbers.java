public class Numbers implements Runnable
{
  @Override public void run()
  {
    while(true)
    {
      for (int i = 0; i < 20; i++)
      {
        System.out.println(i);
        try
        {
          Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
