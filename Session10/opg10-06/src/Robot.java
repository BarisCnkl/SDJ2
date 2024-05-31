import javafx.geometry.Point2D;

public class Robot
{
  private String name;
  private GameBoard board;
  private Behaviour behaviourStrategy;

  public Robot(String name, GameBoard board)
  {
    this.name = name;
    this.board = board;
  }

  public Behaviour getBehaviourStrategy()
  {
    return behaviourStrategy;
  }

  public void setBehaviourStrategy(Behaviour behaviourStrategy)
  {
    this.behaviourStrategy = behaviourStrategy;
  }

  public void move()
  {
    behaviourStrategy.moveCommand(board, new Point2D(0, 0));
  }
}
