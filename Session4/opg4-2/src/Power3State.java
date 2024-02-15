public class Power3State implements RadiatorState
{
  private static final int POWER = 3;

  public Power3State(Radiator radiator)
  {
    try
    {
      Thread.sleep(10000);
      radiator.turnDown();
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }
  }
  @Override public void turnUp(Radiator radiator)
  {
  }

  @Override public void turnDown(Radiator radiator)
  {
    radiator.setPowerState(new Power2State());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
