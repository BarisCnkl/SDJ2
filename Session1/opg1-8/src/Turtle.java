public class Turtle implements Runnable
{
  private int counter;

  @Override public void run()
  {
      for (int counter = 0; counter < 1000; counter++)
      {
        try
        {
          this.counter++;
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
