public class Start
{
  public static void main(String[] args)
  {
   Counter counter1 = new Counter();
   Thread incremineter = new Thread(new CountIncrementer(counter1));
   Thread incrementer2 = new Thread(new CountIncrementer(counter1));

   incremineter.start();
   incrementer2.start();
  }
}
