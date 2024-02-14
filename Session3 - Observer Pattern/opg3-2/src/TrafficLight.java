import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class TrafficLight
{
  private PropertyChangeSupport support;
  private String[] lights = {"GREEN", "YELLOW", "RED", "YELLOW" };
  private int count = 2;
  private String currentLight;

  public TrafficLight()
  {
    currentLight = lights [2];
    support = new PropertyChangeSupport(this);
  }

  public void start() throws InterruptedException
  {
    for (int i = 0; i < 10; i++)
    {
      Thread.sleep(2000);
      count = (count + 1) % 4;
      currentLight = lights[count];
      System.out.println("Light is: " + currentLight);
      lightsChanged();
    }
  }
  public void addPropertyChangeListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }
  private void lightsChanged()
  {
    support.firePropertyChange("LightChanged", null, currentLight);
  }
}
