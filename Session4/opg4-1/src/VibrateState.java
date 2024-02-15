public class VibrateState implements PhoneState
{
  @Override
  public void onReceiveMessage(String message, Phone phone)
  {
    phone.vibrate();
    System.out.println(message);
  }

  @Override
  public void onReceiveCall(Phone phone)
  {
    phone.vibrate();
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
    phone.changeToSoundState();
  }

  @Override
  public void onVolumeButtonDown(Phone phone)
  {
      phone.changeToSilentState();
  }
}
