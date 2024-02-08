import java.util.Random;

public class Rabbit implements Runnable
{
  private Turtle turtle;
  private static final int AHEAD_DISTANCE = 50;

  public Rabbit(Turtle turtle)
  {
    this.turtle = turtle;
  }

  @Override public void run()
  {
    Random random = new Random();
    for (int i = 0; i < 1000; i++)
    {
      try
      {
        if (i > turtle.getCounter() + AHEAD_DISTANCE)
      {
        int sleepTime = random.nextInt(500)+500;
          System.out.println("Rabbit noticed the turtle is not ahead, so its going to sleep for " + sleepTime + " millies");
          Thread.sleep(sleepTime);
      }
          System.out.println("Rabbit has moved " + i + " meters");
      }
      catch (InterruptedException e)
        {
          e.printStackTrace();
        }
      }
    System.out.println("Rabbit has finished!");
    }
  }
