import java.util.ArrayList;

public class Pic implements Runnable
{
  private int timeToSleep;
  private ArrayList <Thread> bears;


  public Pic(ArrayList<Thread> bears, int timeToSleep)
  {
    this.timeToSleep = timeToSleep;
    this.bears=bears;
  }

  public void set(Thread bearThread,int timeToSleep)
  {
    this.timeToSleep = timeToSleep;
  }

  @Override public void run()
  {
    try
    {
      Thread.sleep(timeToSleep);
      for (int i = 0; i < bears.size(); i++)
      {
        bears.get(i).interrupt();
      }
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
