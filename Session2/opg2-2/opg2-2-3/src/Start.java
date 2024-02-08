public class Start
{
  public static void main(String[] args)
  {
   TryLockCounter counter1 = new TryLockCounter();
   Thread incremineter = new Thread(new CountIncrementer(counter1));
   Thread incrementer2 = new Thread(new CountIncrementer(counter1));

   incremineter.start();
   incrementer2.start();
  }
}
