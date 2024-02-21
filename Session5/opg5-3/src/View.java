import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.NumberStringConverter;

public class View
{
  @FXML
  TextField usernameField;
  @FXML
  TextField passwordField;
  @FXML
  TextField passwordRepeatField;
  @FXML
  TextField ageField;
  @FXML
  Button addButton;

  private ViewModel viewModel;

  public View(ViewModel viewModel)
  {
    this.viewModel = viewModel;
  }

  public void initialize()
  {
    usernameField.setTextFormatter(new TextFormatter<String>(change -> {
      String newText = change.getControlNewText();
      if (newText.length() <= 20) {
        return change;
      }
      return null;
    }));
    ageField.setTextFormatter(new TextFormatter<Integer>(change -> {
      String newText = change.getControlNewText();
      if (newText.matches("\\d*")) {
        return change;
      }
      return null;
    }));
    passwordField.textProperty().bindBidirectional(viewModel.passwordProperty());
    passwordRepeatField.textProperty().bindBidirectional(viewModel.passwordRepeatProperty());
  }
  public void setAddButtondisabled()
  {
    addButton.disableProperty().bind(viewModel.shouldSubmitBeDisabledProperty());
  }

  public void onAddButtonPressed()
  {
    viewModel.addUser();
  }
}