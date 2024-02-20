import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewModel
{
  private Model model;
  private StringProperty inputTextProperty;
  private StringProperty outputTextProperty;

  public ViewModel(Model model)
  {
    this.model = model;
    this.inputTextProperty = new SimpleStringProperty();
    this.outputTextProperty = new SimpleStringProperty();
  }

  public StringProperty getInputTextProperty()
  {
    return inputTextProperty;
  }

  public StringProperty getOutputTextProperty()
  {
    return outputTextProperty;
  }
  public void convert()
  {
    String uppercase = model.convertToUppercase(inputTextProperty.get());
    outputTextProperty.set(uppercase);
  }
  public String uppercase(String text)
  {
    return model.convertToUppercase(text);
  }
}
