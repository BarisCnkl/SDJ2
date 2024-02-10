public class main
{
  public static void main(String[] args)
  {
    Counter counter1 = new Counter(100,50);
    Counter counter2 = new Counter(100,50);

    Thread threat1 = new Thread(new CountIncrementer(200,counter1));
    Thread threat2 = new Thread(new CountIncrementer(200,counter1));

    Thread thread3 = new Thread(new CountDecrementer(200,counter1));
    Thread thread4 = new Thread(new CountDecrementer(200,counter1));

    threat1.start();
    threat2.start();

    thread3.start();
    thread4.start();

    threat1.setName("Pezo1");
    threat2.setName("Pezo2");

    thread3.setName("yavso1");
    thread4.setName("yavso2");
  }
}
