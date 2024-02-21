import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

public class ViewModel
{
  private Model model;
  private StringProperty username, password, passwordRepeat;
  private IntegerProperty age;
  private BooleanProperty shouldSubmitBeDisabled;

  public ViewModel(Model model)
  {
    this.model = model;
    username = new SimpleStringProperty();
    password = new SimpleStringProperty();
    passwordRepeat = new SimpleStringProperty();
    age = new SimpleIntegerProperty();
    shouldSubmitBeDisabled = new SimpleBooleanProperty();
  }
  public void addUser()
  {
    if (!password.get().equals(passwordRepeat.get()))
    {
      System.out.println("You passwords do not match");
      return;
    }
    model.addUser(username.get(), password.get(), age.get());
  }

  public StringProperty usernameProperty()
  {
    return username;
  }

  public StringProperty passwordProperty()
  {
    return password;
  }

  public IntegerProperty ageProperty()
  {
    return age;
  }
  public BooleanProperty shouldSubmitBeDisabledProperty()
  {
    return shouldSubmitBeDisabled;
  }

  public StringProperty passwordRepeatProperty()
  {
    passwordRepeat.addListener((observable, oldValue, newValue) -> {
      if(!password.get().equals(passwordRepeat.get())
          || password.get().length() < 8
          || passwordRepeat.get().length() < 8)
      {
        shouldSubmitBeDisabled.set(true);
      }
      else
      {
        shouldSubmitBeDisabled.set(false);
      }
    });
    return passwordRepeat;
  }
}