public class SingleLaneBridge implements Lane
{

  private int carsOnLeftSide = 0;
  private int carsOnRightSide = 0;

  @Override
  public synchronized void enterFromTheLeft()
  {
    carsOnLeftSide++;
    while (carsOnRightSide > 0)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    //start crossing bridge
  }

  @Override
  public synchronized void exitToTheRight()
  {
    carsOnLeftSide--;
    notifyAll();
    //finished crossing bridge
  }

  @Override
  public synchronized void enterFromTheRight()
  {
    carsOnRightSide++;
    while (carsOnLeftSide > 0)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
    }
    //start crossing bridge
  }

  @Override
  public synchronized void exitToTheLeft()
  {
    carsOnRightSide--;
    notifyAll();
    //finished crossing bridge
  }
}