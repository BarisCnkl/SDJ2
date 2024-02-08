import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
  private int count;
  public Counter()
  {
    this.count= 0;
  }
  public void incrementCount()
  {
    synchronized (this)
    {
      count++;
    }
  }

  public int getCount()
  {
    return count;
  }

}
