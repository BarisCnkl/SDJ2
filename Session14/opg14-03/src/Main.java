l                                                                                                           public class Main
{
  public static void main(String[] args)
  {
    SeaBear seaBear = new SeaBear();
    SeaBearGuard guard = new SeaBearGuard(seaBear);
    VisitSeaBear visitSeaBear = guard;

    visitSeaBear.feed("Child");
    visitSeaBear.pet("Child");
    visitSeaBear.view("Child");
    System.out.println("----------------");
    visitSeaBear.feed("Adult");
    visitSeaBear.pet("Adult");
    visitSeaBear.view("Adult");
    System.out.println("----------------");
    visitSeaBear.feed("Zookeeper");
    visitSeaBear.pet("Zookeeper");
    visitSeaBear.view("Zookeeper");
  }
}
