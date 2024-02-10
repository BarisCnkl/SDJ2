public class CountIncrementer implements Runnable
{
  private int updates;
  private Counter counter;

  public CountIncrementer(int updates, Counter counter)
  {
    this.updates = updates;
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.increment();
    }
    System.out.println("Counter value: " + counter.getValue());
  }
}
