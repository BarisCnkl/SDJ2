import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnector
{
  private static DatabaseConnector databaseConnector;
  private static Lock lock = new ReentrantLock();


  private DatabaseConnector()
  {
    //Initializing the database connection would happen here.
  }
public static DatabaseConnector getInstance()
{
  if (databaseConnector == null)
  {
    synchronized (lock)
    {
      if (databaseConnector == null)
      {
        databaseConnector = new DatabaseConnector();
      }
    }
  }
  return databaseConnector;
}
  public void connect()
  {
    System.out.println("Database connection established");
  }
}