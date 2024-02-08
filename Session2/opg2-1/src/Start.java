public class Start
{
  public static void main(String[] args)
  {
    ListContainer listContainer1 = new ListContainer();
    Thread Thread1 = new Thread(new lengthprint(listContainer1));
    Thread Thread2 = new Thread(new lengthprint(listContainer1));

    Thread1.start();
    Thread2.start();

  }
}
