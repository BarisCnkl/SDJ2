public class Test
{
  public static void main(String[] args)
  {
    GameBoard board = new GameBoard();
    Robot robot = new Robot("Botty", board);

    robot.setBehaviourStrategy(new NeutralBehaviour());
    robot.move();

    robot.setBehaviourStrategy(new AggressiveBehaviour());
    robot.move();

    robot.setBehaviourStrategy(new DefensiveBehaviour());
    robot.move();
  }
}