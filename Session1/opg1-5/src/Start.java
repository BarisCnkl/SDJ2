public class Start
{
  public static void main(String[] args) throws InterruptedException
  {
    Thread thread1 = new Thread(new RunnableClass(0,25000));
    Thread thread2 = new Thread(new RunnableClass(25000,50000));
    Thread thread3 = new Thread(new RunnableClass(50000,75000));
    Thread thread4 = new Thread(new RunnableClass(75000,100000));

    thread1.start();
    thread1.join();

    thread2.start();
    thread2.join();

    thread3.start();
    thread3.join();

    thread4.start();
    thread4.join();
  }
}
