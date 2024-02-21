package CreateUser;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

public class CreateUserview
{
  @FXML
  TextField usernameField;
  @FXML
  TextField passwordField;
  @FXML
  TextField passwordRepeatField;
  @FXML
  TextField ageField;

  private CreateUserViewModel CreateUserViewModel;

  public CreateUserview(CreateUserViewModel CreateUserViewModel)
  {
    this.CreateUserViewModel = CreateUserViewModel;
  }

  public void initialize()
  {
    usernameField.textProperty().bindBidirectional(CreateUserViewModel.usernameProperty());
    passwordField.textProperty().bindBidirectional(CreateUserViewModel.passwordProperty());
    passwordRepeatField.textProperty().bindBidirectional(CreateUserViewModel.passwordRepeatProperty());
    ageField.textProperty().bindBidirectional(CreateUserViewModel.ageProperty(), new NumberStringConverter());
  }

  public void onAddButtonPressed()
  {
    CreateUserViewModel.addUser();
  }
}