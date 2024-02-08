import java.util.ArrayList;

public class Cave
{
  private ArrayList<Thread> bears;

  public Cave()
  {
    this.bears = new ArrayList<>();
  }
  public void addBears(Thread bear)
  {
    bears.add(bear);
  }

  public void wakeAllBears()
  {
    for (int i = 0; i < bears.size(); i++)
    {
      if (bears.get(i).isInterrupted())
      {
        bears.get(i).interrupt();
      }
      bears.clear();
    }

  }
}
