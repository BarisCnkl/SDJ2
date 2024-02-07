public class start
{
  public static void main(String[] args)
  {
    Thread NumberCounter = new Thread(new Numbers());

    NumberCounter.start();
  }
}
