public class Start
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    Rabbit rabbit = new Rabbit(turtle);

    Thread turtleThread = new Thread(turtle);
    Thread rabbitThread = new Thread(rabbit);

    System.out.println("3-2-1 GO!");
    turtleThread.start();
    rabbitThread.start();
  }
}
