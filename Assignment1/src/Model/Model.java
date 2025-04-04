package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Model implements PropertyChangeSubject
{
  private List<Vinyl> vinyls;
  private List<User> users;
  private PropertyChangeSupport propertyChangeSupport;

  public Model()
  {
    this.vinyls = new ArrayList<>();
    this.users = new ArrayList<>();
    propertyChangeSupport = new PropertyChangeSupport(this);
  }
  public void addVinyl(Vinyl vinyl)
  {
    vinyls.add(vinyl);
    propertyChangeSupport.firePropertyChange("vinylUpdate", null, vinyls);
  }
  public void removeVinyl(Vinyl vinyl)
  {
    vinyls.remove(vinyl);
    propertyChangeSupport.firePropertyChange("vinylUpdate", null, vinyls);
  }

  public List<Vinyl> getVinyls()
  {
    return vinyls;
  }

  public List<User> getUsers()
  {
    return users;
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);

  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(name,listener);
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
  public void addUser(User user)
  {
    users.add(user);
  }
  public void borrowVinyl(Vinyl vinyl, User user)
  {
    for (int i = 0; i < vinyls.size(); i++)
    {
      if (vinyls.get(i).equals(vinyl))
      {
        vinyls.get(i).vinylBorrow(user);
      }
    }
  }
  public void reserveVinyl(Vinyl vinyl, User user)
  {
    for (int i = 0; i < vinyls.size(); i++)
    {
      if (vinyls.get(i).equals(vinyl))
      {
        vinyls.get(i).vinylReserve(user);
      }
    }
  }
  public void returnVinyl(Vinyl vinyl)
  {
    for (int i = 0; i < vinyls.size(); i++)
    {
      if (vinyls.get(i).equals(vinyl))
      {
        vinyls.get(i).returnVinyl();
      }
    }
  }
}
