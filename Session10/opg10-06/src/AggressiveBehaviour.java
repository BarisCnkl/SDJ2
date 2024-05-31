import javafx.geometry.Point2D;

public class AggressiveBehaviour implements Behaviour
{
  @Override public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Aggressive Behaviour: if find another robot attack it");
    return 1;
  }
}
