package Model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Model implements PropertyChangeSubject
{
  private List<User> users;
  private PropertyChangeSupport propertyChangeSupport;

  public Model()
  {
    users = new ArrayList<>();
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public void addUser(String username, String password, int age)
  {
    users.add(new User(username, password, age));
    System.out.println("User added: " + username + ", " + password + ", " + age);
    propertyChangeSupport.firePropertyChange("UserAdded", null, users);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
    listener.propertyChange(new PropertyChangeEvent(this,null,null,users));
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(name,listener);
    listener.propertyChange(new PropertyChangeEvent(this,name,null,users));
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(name,listener);
  }
}