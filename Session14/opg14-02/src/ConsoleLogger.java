public class ConsoleLogger implements Logger
{
  @Override
  public void log(String textToLog)
  {
    System.out.println(textToLog);
  }
}