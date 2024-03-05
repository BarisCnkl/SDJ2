package ViewModel;

import Model.User;
import Model.Model;
import javafx.beans.property.*;

public class LogInViewModel
{
  private Model model;
  private StringProperty id;
  private BooleanProperty buttonDisabled;

  public LogInViewModel(Model model)
  {
    this.model = model;
    id = new SimpleStringProperty();
    buttonDisabled = new SimpleBooleanProperty();
    buttonDisabled.set(true);
  }
  public StringProperty getIdProperty()
  {
    return id;
  }

  public BooleanProperty getButtonDisabledProperty()
  {
    return buttonDisabled;
  }

  public void addUser()
  {
    int id = Integer.parseInt(getIdProperty().get());
    model.addUser(new User(id));
  }
  public boolean isIdInt()
  {
    try
    {
      Integer.parseInt(getIdProperty().get());
    }
    catch (NumberFormatException e)
    {
      return false;
    }
    catch (NullPointerException e)
    {
      return false;
    }
    return true;
  }
  public  void validateText()
  {
    if (isIdInt() && getIdProperty().get().length() == 4)
    {
      buttonDisabled.set(false);
    }
    else
    {
      buttonDisabled.set(true);
    }
  }
}
