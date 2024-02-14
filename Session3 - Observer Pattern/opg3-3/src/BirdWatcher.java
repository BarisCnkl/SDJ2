import java.beans.PropertyChangeListener;
import java.util.Random;

public class BirdWatcher
{
  private Bird birdToWatch;
  public BirdWatcher(Bird birdToWatch)
  {
    this.birdToWatch = birdToWatch;
    this.birdToWatch.propertyChangeListenerAdd("birdMove", evt -> reactToFlapping());
    this.birdToWatch.propertyChangeListenerAdd("birdSing", evt -> reactToSing());
  }
  public void reactToFlapping()
  {
    int random = (int) (Math.random()*3) + 1;
    if (random == 1)
    {
      System.out.println("Bird Watcher: Ooh!");
    }
    else if(random == 2)
    {
      System.out.println("Bird Watcher: How nice");
    }
    else
    {
      System.out.println("Bird Watcher: Would you look at that");
    }
  }
  public void reactToSing()
  {
    int random = (int) (Math.random()*3) + 1;
    if (random == 1)
    {
      System.out.println("Bird Watcher: Wow!");
    }
    else if(random == 2)
    {
      System.out.println("Bird Watcher: How nice");
    }
    else
    {
      System.out.println("Bird Watcher: What a lovely voice!");
    }
  }
}
