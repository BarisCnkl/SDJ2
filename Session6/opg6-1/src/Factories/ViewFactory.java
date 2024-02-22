package Factories;

import CreateUser.CreateUserview;
import UserList.UserListView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory
{
  private ViewModelFactory viewModelFactory;
  private UserListView userListView;
  private CreateUserview createUserView;

  private final Stage primaryStage;
  private FXMLLoader fxmlLoader;


  public ViewFactory(ViewModelFactory viewModelFactory, Stage primaryStage)
  {
    this.viewModelFactory = viewModelFactory;
    this.primaryStage = primaryStage;
  }

  public UserListView getUserListView() throws IOException
  {
    if(userListView == null)
    {
      fxmlLoader = new FXMLLoader(getClass().getResource("../UserList/UserListview.fxml"));
      fxmlLoader.setControllerFactory(controllerClass -> new UserListView(viewModelFactory.getUserListViewModel()));

      Scene createUserScene = new Scene(fxmlLoader.load());
      primaryStage.setTitle("View Users");
      primaryStage.setScene(createUserScene);
      primaryStage.show();
      userListView = fxmlLoader.getController();
    }
    return userListView;
  }

  public CreateUserview getCreateUserView() throws IOException
  {
    if(createUserView == null)
    {
      fxmlLoader = new FXMLLoader(getClass().getResource("../CreateUser/CreateUserview.fxml"));
      fxmlLoader.setControllerFactory(controllerClass -> new CreateUserview(viewModelFactory.getCreateUserViewModel()));

      Scene userListScene = new Scene(fxmlLoader.load());
      Stage secondaryStage = new Stage();
      secondaryStage.setTitle("Create User");
      secondaryStage.setScene(userListScene);
      secondaryStage.show();
      createUserView = fxmlLoader.getController();
    }
    return createUserView;
  }
}
