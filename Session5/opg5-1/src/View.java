import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

public class View
{
  @FXML private TextField inputField;
  @FXML private TextField outputField;
  private ViewModel viewModel;

  public View(ViewModel viewModel)
  {
    this.viewModel = viewModel;
  }
  public void initialize()
  {
    inputField.textProperty().bindBidirectional(viewModel.getInputTextProperty());
    outputField.textProperty().bindBidirectional(viewModel.getOutputTextProperty());
  }
  public void onConvertButtonPressed()
  {
    viewModel.convert();
  }
}
