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
      System.out.println("SleepyDriver " + id + "turns engine on aannd Drives");
    }
    else if ("YELLOW".equals(currentlight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("SleepyDriver " + id + "zzzzzz");
      }
      else
      {
        System.out.println("SleepyDriver " + id + "slows down");
      }
    }
    else if("RED".equals(currentlight))
    {
      System.out.println("SleepyDriver " + id + "stops");
    }
    previousLight = currentlight;
  }
}
