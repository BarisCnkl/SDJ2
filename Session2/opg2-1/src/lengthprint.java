public class lengthprint implements Runnable
{
  private ListContainer listContainer;

  public lengthprint(ListContainer listContainer)
  {
    this.listContainer = listContainer;
  }

  @Override public void run()
  {
    for (int i = 0; i < 100000; i++)
    {
      listContainer.add(i);
    }
    System.out.println(listContainer.returnlength());
  }
}
