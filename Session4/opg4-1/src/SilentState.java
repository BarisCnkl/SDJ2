public class SilentState implements PhoneState
{
  @Override
  public void onReceiveMessage(String message, Phone phone)
  {
    System.out.println(message);
  }

  @Override
  public void onReceiveCall(Phone phone)
  {
    phone.receiveCall();
  }

  @Override
  public void onVolumeButtonUp(Phone phone)
  {
    int volume = phone.getVolume();
    if (volume < 100)
    {
      phone.turnVolumeUp();
    }
    phone.changeToVibrateState();
  }

  @Override
  public void onVolumeButtonDown(Phone phone)
  {
    int vol = phone.getVolume();
    if (vol > 1)
    {
      phone.turnVolumeDown();
    }
  }
}
