public class Buffer
{
  private int item;
  private boolean available = false;

  public synchronized void put(int item)
  {
    while (available)
    {
      try
      {
        wait();
      } catch (InterruptedException e)
      {
        Thread.currentThread().interrupt();
      }
    }
    this.item = item;
    available = true;
    notifyAll();
  }
  public synchronized int get()
  {
    while (!available)
    {
      try
      {
        wait();
      }catch (InterruptedException e)
      {
        Thread.currentThread().interrupt();
      }
    }
    int item = this.item;
    available = false;
    return item;
  }
}
