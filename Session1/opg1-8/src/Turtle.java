public class Turtle implements Runnable
{
  private int counter;

  @Override public void run()
  {
      for (int counter = 0; counter < 100; counter++)
      {
        try
        {
          Thread.sleep(10);
          System.out.println("Turtle has moved " + counter + " meters");
        }
        catch (InterruptedException e)
        {
          e.printStackTrace();
        }
      }
      System.out.println("Turtle has finished!");
  }
  public int getCounter()
  {
    return counter;
  }
}
