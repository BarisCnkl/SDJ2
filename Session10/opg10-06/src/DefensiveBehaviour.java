import javafx.geometry.Point2D;

public class DefensiveBehaviour implements Behaviour
{

  @Override
  public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Defensive Behaviour: if find another robot run from it");
    return -1;
  }
}