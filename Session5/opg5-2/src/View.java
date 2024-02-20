import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class View
{
  @FXML private TextField textFieldA;
  @FXML private TextField textFieldB;
  private ViewModel viewModel;

  public View(ViewModel viewModel)
  {
    this.viewModel = viewModel;
  }
  public void initialize()
  {
    textFieldA.textProperty().bindBidirectional(viewModel.getSimpleTextProperty());
    textFieldB.textProperty().bindBidirectional(viewModel.getSimpleTextProperty());
  }
}
