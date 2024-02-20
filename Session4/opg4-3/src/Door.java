public class Door
{
  private DoorState currentState;

  public Door()
  {
    this.currentState = new ClosedState();
  }
  public void pressButton()
  {
    currentState.onButtonPressed(this);
  }
  public void onClosedState()
  {
    currentState = new ClosedState(this);
  }
  public void onOpenState()
  {
    currentState = new OpenState(this);
  }
  public void onclosingState()
  {
    currentState = new ClosingState(this);
  }
  public void onOpeningState()
  {
    currentState = new OpeningState(this);
  }
}

