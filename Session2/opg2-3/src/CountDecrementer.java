public class CountDecrementer implements Runnable
{
  private int updates;
  private Counter counter;

  public CountDecrementer(int updates, Counter counter)
  {
    this.updates = updates;
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.decrement();
    }
    System.out.println("Counter value: " + counter.getValue());
  }
}
