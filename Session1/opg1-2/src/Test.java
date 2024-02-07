public class Test
{
  public static void main(String[] args)
  {
    Thread printHi = new Thread(new Hi());
    Thread printHello = new Thread(new Hello());

    printHi.run();
    printHello.run();
  }
}
