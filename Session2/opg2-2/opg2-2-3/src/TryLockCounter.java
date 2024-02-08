import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockCounter
{
  private int count;
  Lock lock = new ReentrantLock();
  public TryLockCounter()
  {
    this.count= 0;
  }
  public void incrementCount()
  {
    while (!lock.tryLock())
    {
      try
      {
        System.out.println("Lock was in use, trying again...");
        Thread.sleep(10);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    count++;
    lock.unlock();
  }

  public synchronized int getCount()
  {
    return count;
  }

}
