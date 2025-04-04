package Model;

import java.util.ArrayList;
import java.util.List;

public class Model
{
  private List<User> users;

  public Model()
  {
    users = new ArrayList<>();
  }

  public void addUser(String username, String password, int age)
  {
    users.add(new User(username, password, age));
    System.out.println("User added: " + username + ", " + password + ", " + age);
  }

  public List<User> getUsers()
  {
    return users;
  }
}