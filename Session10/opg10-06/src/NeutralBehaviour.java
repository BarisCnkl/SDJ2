import javafx.geometry.Point2D;

public class NeutralBehaviour implements Behaviour
{
  @Override
  public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Neutral Behaviour: if find another robot ignore it");
    return 0;
  }
}