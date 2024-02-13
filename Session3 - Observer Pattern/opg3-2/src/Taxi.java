public class Taxi
{
  private String previousLight;
  private int id;

  public Taxi(int id)
  {
    this.id = id;
  }

  public void setLight(String currentlight)
  {
    if ("GREEN".equals(currentlight))
    {
      System.out.println("Taxi " + id + "Drives");
    }
    else if ("YELLOW".equals(currentlight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Taxi " + id + "turns engine on");
      }
      else
      {
        System.out.println("Taxi " + id + "Im busy i drive");
      }
    }
    else if("RED".equals(currentlight))
    {
      System.out.println("Taxi " + id + "stops");
    }
    previousLight = currentlight;
  }
}
