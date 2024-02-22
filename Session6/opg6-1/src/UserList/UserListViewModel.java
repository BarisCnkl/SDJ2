package UserList;

import Model.Model;
import Model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class UserListViewModel
{
  private Model model;
  private ObservableList<User> userObservableList;
  public UserListViewModel(Model model)
  {
    this.model = model;
    userObservableList = FXCollections.observableArrayList();
    model.addPropertyChangeListener("UserAdded", this::update);
  }

  public ObservableList<User> getUserObservableList()
  {
    return userObservableList;
  }
  private void update(PropertyChangeEvent propertyChangeEvent)
  {
    userObservableList.clear();
    userObservableList.addAll((List<User>)propertyChangeEvent.getNewValue());
  }

}
