import java.util.ArrayList;

public class Start
{
  public static void main(String[] args)
  {
    ArrayList<Thread> bears = new ArrayList<>();
    Cave cave1 = new Cave();
    Thread pic = new Thread(new Pic(bears, 6000));
    Thread bear1 = new Thread(new Bear(cave1));

    Thread bear2 = new Thread(new Bear(cave1));

    Thread bear3 = new Thread(new Bear(cave1));

    Thread bear4 = new Thread(new Bear(cave1));

    Thread bear5 = new Thread(new Bear(cave1));

    bears.add(bear1);
    bears.add(bear2);
    bears.add(bear3);
    bears.add(bear4);
    bears.add(bear5);

    bear1.start();
    bear2.start();
    bear3.start();
    bear4.start();
    bear5.start();
    pic.start();
  }
}
