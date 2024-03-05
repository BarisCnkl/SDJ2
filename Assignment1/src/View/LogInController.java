package View;

import ViewModel.LogInViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

public class LogInController
{
  @FXML TextField UserIdField;
  @FXML Button LogInButton;

  private LogInViewModel logInViewModel;

  public LogInController(LogInViewModel logInViewModel)
  {
    this.logInViewModel = logInViewModel;
  }
  public void initialize()
  {
    UserIdField.textProperty().bindBidirectional(logInViewModel.getIdProperty());
    LogInButton.disableProperty().bind(logInViewModel.getButtonDisabledProperty());
  }
  public void onButtonClicked()
  {
    logInViewModel.addUser();
  }
}
