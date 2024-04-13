public class Main
{
  public static void main(String[] args)
  {
    Logger logger = new LogLevelController(new ConsoleLogger());
    logger.log("Warning: Something is dangerous");
    logger.log("Error: Something bad has happened!");
  }
}
