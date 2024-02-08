import java.util.ArrayList;

public class ListContainer
{
  private ArrayList <Integer> integers;

  public ListContainer()
  {
    this.integers = new ArrayList<>();
  }

  public void add(int i)
  {
    synchronized (this)
    {
      integers.add(i);
    }
  }
  public int returnlength()
  {
    return integers.size();
  }

}
