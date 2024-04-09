package Client.views;

import Client.model.ChatModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class ChatViewModel
{
  ChatModel model;
  List<String> messageLogs;
  StringProperty messageProperty;

  public ChatViewModel(ChatModel model)
  {
    this.model = model;
    messageLogs = FXCollections.observableArrayList();
    messageProperty = new SimpleStringProperty();
    model.addPropertyChangeListener("New message",this::refreshLogs);
  }

  private void refreshLogs(PropertyChangeEvent propertyChangeEvent)
  {
    messageLogs.clear();
    messageLogs.addAll((List<String>)propertyChangeEvent.getNewValue());
    messageLogs = (List<String>) propertyChangeEvent.getNewValue();
  }

  public StringProperty messagePropertyProperty()
  {
    return messageProperty;
  }

  public List<String> getMessageLogs()
  {
    return messageLogs;
  }
  public void sendMessage()
  {
    model.sendMessage(messageProperty.get());
  }
}
