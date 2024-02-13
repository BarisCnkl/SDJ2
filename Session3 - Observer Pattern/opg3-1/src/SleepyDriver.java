public class SleepyDriver
{
  private String previousLight;
  private int id;

  public SleepyDriver(int id)
  {
    this.id = id;
  }

  public void setLight(String currentlight)
  {
    if ("GREEN".equals(currentlight))
    {
      System.out.println("Car " + id + "turns engine on aannd Drives");
    }
    else if ("YELLOW".equals(currentlight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Car " + id + "zzzzzz");
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
