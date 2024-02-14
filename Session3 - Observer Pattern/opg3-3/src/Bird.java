import java.beans.PropertyChangeSupport;

public class Bird implements Pro
{
  private PropertyChangeSupport support;
  private String event;

  public Bird(PropertyChangeSupport support, String event)
  {
    support = new PropertyChangeSupport(this);
  }

  public void setEvent(String event)
  {
    if (event.equals("Flaps"))
    {
      System.out.println("Peacock flashes its wings");
    }
    else if(event.equals("Sing"))
    {
      System.out.println("Peacock whistles");
    }
    else
    {
      System.out.println("Bird waiting");
    }
  }
}
