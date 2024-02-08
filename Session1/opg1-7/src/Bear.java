public class Bear implements Runnable
{
  private Cave cave;

  public Bear(Cave cave)
  {
    this.cave = cave;
  }

  @Override public void run()
  {
    try
      {
        Thread.sleep(5000);
        System.out.println("OUU YEAA!!! im well rested luksus");
      }
      catch (InterruptedException e)
      {
        System.out.println("LAAAAN sikerim belanI pic");
      }
  }
}
