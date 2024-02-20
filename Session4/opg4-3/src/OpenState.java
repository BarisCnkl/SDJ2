public class OpenState implements DoorState
{
  private final Thread closeDoorAfterSetTimeThread;

  public OpenState(Thread closeDoorAfterSetTimeThread)
  {

  }

  @Override public void onButtonPressed(Door door)
  {
  }
}
