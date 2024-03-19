import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnector
{
  private static Map<String,DatabaseConnector> allDatabaseConnectors = new HashMap<>();


  private DatabaseConnector(String key)
  {
    //Initializing the database connection would happen here.
  }
public static DatabaseConnector getInstance(String key)
{
  DatabaseConnector instance = allDatabaseConnectors.get(key);
  if (instance == null)
  {
    instance = new DatabaseConnector(key);
    allDatabaseConnectors.put(key,instance);
  }
  return instance;
}
  public void connect()
  {
    System.out.println("Database connection established");
  }
}