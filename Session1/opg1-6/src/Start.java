public class Start
{
  public static void main(String[] args)
  {
    Thread bear = new Thread(new Bear());
    Thread pic = new Thread(new Pic(bear));

    bear.start();
    pic.start();
  }
}
