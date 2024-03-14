package Datafiles;

public class User
{
  private int userId;

  public User(int userId)
  {
    this.userId = userId;
  }

  public int getUserId()
  {
    return userId;
  }

  @Override public String toString()
  {
    return  userId + "";
  }
}
