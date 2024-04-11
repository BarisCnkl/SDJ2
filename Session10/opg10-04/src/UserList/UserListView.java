package UserList;

import Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class UserListView
{
  @FXML ListView<User> listview;
  private UserListViewModel userListViewModel;

  public UserListView(UserListViewModel CreateUserListViewModel)
  {
    this.userListViewModel = CreateUserListViewModel;
  }
  public void initialize()
  {
    listview.setItems(userListViewModel.getUserObservableList());
  }
  public void OnRefreshClicked()
  {
    userListViewModel.refreshList();
  }
}
