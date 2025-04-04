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
    ViewModel viewModel = new ViewModel();

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("View.fxml"));
    fxmlLoader.setControllerFactory(controllerClass -> new View(viewModel));

    Scene scene = new Scene(fxmlLoader.load());
    primaryStage.setTitle("View");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}