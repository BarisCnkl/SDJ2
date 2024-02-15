public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    Radiator radiator = new Radiator();
    System.out.println(radiator.getPower());
    radiator.turnUp();
    System.out.println(radiator.getPower());
    radiator.turnUp();
    System.out.println(radiator.getPower());
    radiator.turnUp();
    System.out.println(radiator.getPower());
    radiator.turnDown();
    System.out.println(radiator.getPower());
    radiator.turnDown();
    System.out.println(radiator.getPower());
    radiator.turnDown();
    System.out.println(radiator.getPower());
    Thread.sleep(2000);
    System.out.println(radiator.getPower());
  }
}
