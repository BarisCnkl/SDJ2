import java.beans.PropertyChangeSupport;

public class BlindBirdWatcher
{
  private Bird birdToWatch;
  public BlindBirdWatcher(Bird birdToWatch)
  {
    this.birdToWatch = birdToWatch;
    this.birdToWatch.propertyChangeListenerAdd("birdSing", evt -> reactToSing());
  }
  public void reactToSing()
  {
    int random = (int) (Math.random()*3) + 1;
    if (random == 1)
    {
      System.out.println("Blind bird Watcher: Wow!");
    }
    else if(random == 2)
    {
      System.out.println("Blind bird Watcher: How nice");
    }
    else
    {
      System.out.println("Blind bird Watcher: What a lovely voice!");
    }
  }
}
