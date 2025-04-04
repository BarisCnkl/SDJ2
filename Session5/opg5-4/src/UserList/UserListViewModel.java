package UserList;

import Model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Model.User;

public class UserListViewModel
{
  private Model model;
  private ObservableList<User> userObservableList;
  public UserListViewModel(Model model)
  {
    this.model = model;
    userObservableList = FXCollections.observableArrayList();
  }

  public ObservableList<User> getUserObservableList()
  {
    return userObservableList;
  }

  public void refreshList()
  {
    userObservableList.clear();
    userObservableList.addAll(model.getUsers());
  }
}
