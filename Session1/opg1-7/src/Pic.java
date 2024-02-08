import java.util.ArrayList;

public class Pic implements Runnable
{
  private Thread bearThread;
  private int timeToSleep;


  public Pic(ArrayList<Thread> bears)
  {
    this.bearThread = bearThread;
    this.timeToSleep = timeToSleep;
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
