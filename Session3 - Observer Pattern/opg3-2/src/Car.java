public class Car
{
  private String previousLight;
  private int id;

  public Car(int id)
  {
    this.id = id;
  }

  public void setLight(String currentlight)
  {
    if ("GREEN".equals(currentlight))
    {
      System.out.println("Car " + id + "Drives");
    }
    else if ("YELLOW".equals(currentlight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Car " + id + "turns engine on");
      }
      else
      {
        System.out.println("Car " + id + "slows down");
      }
    }
    else if("RED".equals(currentlight))
    {
      System.out.println("Car " + id + "stops");
    }
    previousLight = currentlight;
  }
}
