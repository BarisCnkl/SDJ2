import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Bird
{
  private PropertyChangeSupport support;
  public Bird()
  {
    support = new PropertyChangeSupport(this);
  }
  public void start()
  {
    while(true)
    {
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
      int random = (int) (Math.random()*2) + 1;
      if (random == 1)
      {
        System.out.println("Peacock flaps its wings");
        String birdMove = "Peacock flaps its wings";
        support.firePropertyChange("birdMove", null , null);
      }
      else
      {
        System.out.println("Peacock whistles");
        String birdMove = "Peacock whistles";
        support.firePropertyChange("birdSing", null , null);
      }
    }
  }

  public void propertyChangeListenerAdd(String name, PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(name,listener);
  }
  public void propertyChangeListenerRemove(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }
}
