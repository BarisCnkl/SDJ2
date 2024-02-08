import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Counter
{
  private int countA;
  private int countB;
  Lock lockA = new ReentrantLock();
  Lock lockB = new ReentrantLock();
  public Counter()
  {
    this.countA = 0;
    this.countB = 0;
  }
  public void incrementCountA()
  {
    synchronized (lockA)
    {
      countA++;
    }
  }
  public void incrementCountB()
  {
    synchronized (lockB)
    {
      countB++;
    }
  }

  public int getCountA()
  {
    synchronized (lockA)
    {
      return countA;
    }
  }

  public int getCountB()
  {
    synchronized (lockB)
    {
      return countB;
    }
  }
}
