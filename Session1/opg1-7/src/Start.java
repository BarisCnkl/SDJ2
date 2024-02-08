import java.util.ArrayList;

public class Start
{
  public static void main(String[] args)
  {
    ArrayList<Thread> bears = new ArrayList<>();
    Cave cave1 = new Cave();
    Thread pic = new Thread(new Pic(bears);
    Thread bear1 = new Thread(new Bear(cave1));

    Thread bear2 = new Thread(new Bear(cave1));

    Thread bear3 = new Thread(new Bear(cave1));

    Thread bear4 = new Thread(new Bear(cave1));

    Thread bear5 = new Thread(new Bear(cave1));

    bear1.start();
    bear2.start();
    bear3.start();
    bear4.start();
    bear5.start();
    pic.start();
  }
}
