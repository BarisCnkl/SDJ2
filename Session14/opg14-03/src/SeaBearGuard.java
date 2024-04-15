public class SeaBearGuard implements VisitSeaBear
{
  private SeaBear seaBearToGurad;

  public SeaBearGuard(SeaBear seaBearToGurad)
  {
    this.seaBearToGurad = seaBearToGurad;
  }

  @Override public void view(String personType)
  {
    seaBearToGurad.view(personType);
  }

  @Override public void feed(String personType)
  {
    if (personType.equals("Zookeeper"))
    {
      seaBearToGurad.feed(personType);
    }
    else
      System.out.println("The Person is not allowed to feed :::" + personType);
  }

  @Override public void pet(String personType)
  {
    if (personType.equals("Child"))
    {
      seaBearToGurad.pet(personType);
    }
    else
      System.out.println("The Person is not allowed to pet ::::" + personType);
  }
}
