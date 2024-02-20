import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ViewModel
{
  private StringProperty simpleText;

  public ViewModel()
  {
    this.simpleText = new SimpleStringProperty();
  }
  public StringProperty getSimpleTextProperty()
  {
    return simpleText;
  }
}
