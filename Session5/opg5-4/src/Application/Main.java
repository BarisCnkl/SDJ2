package Application;

import CreateUser.CreateUserViewModel;
import CreateUser.CreateUserview;
import Model.Model;
import UserList.UserListView;
import UserList.UserListViewModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
  public static void main(String[] args)
  {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Model model = new Model();
    CreateUserViewModel createUserViewModel = new CreateUserViewModel(model);
    UserListViewModel userListViewModel = new UserListViewModel(model);

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
        "CreateUser/CreateUserView.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new CreateUserview(createUserViewModel));

    Scene createUserScene = new Scene(fxmlLoader.load());
    primaryStage.setTitle("Create User");
    primaryStage.setScene(createUserScene);
    primaryStage.show();

    fxmlLoader = new FXMLLoader(getClass().getResource(
        "UserList/UserListview.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new UserListView(userListViewModel));

    Scene userListScene = new Scene(fxmlLoader.load());
    Stage secondaryStage = new Stage();
    secondaryStage.setTitle("View Users");
    secondaryStage.setScene(userListScene);
    secondaryStage.show();
  }
}