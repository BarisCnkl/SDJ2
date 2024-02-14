import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener
{
  private String previousLight;
  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void setLight(String currentlight)
  {
    if ("GREEN".equals(currentlight))
    {
      System.out.println("Pedestrian " + id + "waiting");
    }
    else if ("YELLOW".equals(currentlight))
    {
      if ("RED".equals(previousLight))
      {
        System.out.println("Pedestrian " + id + "slows down");
      }
      else
      {
        System.out.println("Pedestrian " + id + "getting readdy to cross the road");
      }
    }
    else if("RED".equals(currentlight))
    {
      System.out.println("Pedestrian " + id + "walks");
    }
    previousLight = currentlight;
  }
  public void propertyChange(PropertyChangeEvent evt)
  {
    setLight((String) evt.getNewValue());
  }
}
