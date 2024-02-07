public class RunnableClass implements Runnable
{
  private int x,y;

  public RunnableClass(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  @Override public void run()
  {
    while(true)
    {
      for (int i = x; i < y; i++)
      {
        System.out.println(i);
      }
    }
  }
}
