public class SeaBear implements VisitSeaBear
{

  @Override public void view(String personType)
  {
    System.out.println("Bear is viewed by " + personType);
  }

  @Override public void feed(String personType)
  {
    System.out.println("Bear is being fed by zookeeper " + personType);
  }

  @Override public void pet(String personType)
  {
    System.out.println("Bear is petted by a child " + personType);
  }
}
