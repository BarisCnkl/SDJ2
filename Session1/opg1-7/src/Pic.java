public class Pic implements Runnable
{
  private Thread bearThread;

  public Pic(Thread bearThread)
  {
    this.bearThread = bearThread;
  }

  @Override public void run()
  {
    try
    {
      Thread.sleep(3000);
      bearThread.interrupt();
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }
  }
}
