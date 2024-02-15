public class Main
{
  public static void main(String[] args)
  {
    Phone phone = new Phone();
    phone.receiveMessage("This message was delivered while phone should be in Sound State");
    for (int i = 0; i <= 100; i++)
    {
      phone.volumeDownButton();
    }
    phone.receiveMessage("This message was delivered while phone should be in Silent State");
    phone.volumeUpButton();
    phone.receiveMessage("This message was delivered while phone should be in Vibrate State");
  }
}
