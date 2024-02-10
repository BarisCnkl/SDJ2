public class Counter
{
  private long value, max, min;

  public Counter(long max, long min)
  {
    this.max = max;
    this.min = min;
    value = 0;
  }
  public synchronized void increment()
  {
    while (value >= max)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    value++;
    System.out.println(value + " : " + Thread.currentThread().getName());
    notifyAll();
  }
  public synchronized void decrement()
  {
    while (value <= min)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    value--;
    System.out.println(value + " : " + Thread.currentThread().getName());
    notifyAll();
  }

  public synchronized long getValue()
  {
    return value;
  }
}
