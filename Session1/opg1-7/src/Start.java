import java.util.ArrayList;

public class Start
{
  public static void main(String[] args)
  {
    ArrayList<Thread> bears = new ArrayList<>();
    Thread bear1 = new Thread(new Bear());
    bears.add(0,bear1);

    Thread bear2 = new Thread(new Bear());
    bears.add(1,bear1);

    Thread bear3 = new Thread(new Bear());
    bears.add(2,bear1);

    Thread bear4 = new Thread(new Bear());
    bears.add(3,bear1);

    Thread bear5 = new Thread(new Bear());
    bears.add(4,bear1);

    Thread pic = new Thread(new Pic(bear1));

    bear1.start();
    bear2.start();
    bear3.start();
    bear4.start();
    bear5.start();
    pic.start();
  }
}
