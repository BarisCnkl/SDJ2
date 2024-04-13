public class LogLevelController implements Logger
{
  private final ConsoleLogger consoleLogger;
  private String logLevel;
  public LogLevelController(ConsoleLogger consoleLogger)
  {
    this.consoleLogger = consoleLogger;
    this.logLevel = "SPARCE";
  }

  public void setLogLevel(String logLevel)
  {
    this.logLevel = logLevel;
  }

  @Override public void log(String textToLog)
  {
    switch (logLevel.toUpperCase())
    {
      case "SPARCE":
      if (textToLog.toLowerCase().contains("error"))
      {
        consoleLogger.log(textToLog);
      }
      break;
      case "VERBOSE":
        consoleLogger.log(textToLog);
        break;
    }
    }
}
