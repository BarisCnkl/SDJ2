public class CountIncrementer implements Runnable
{
  private TryLockCounter counter;

  public CountIncrementer(TryLockCounter counter)
  {
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < 10000000 ; i++)
    {
      counter.incrementCount();
    }
    System.out.println(counter.getCount());
  }
}
