package Client.model;

import TransferObjects.InputOutput;
import util.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ChatModel implements ChatInterface, PropertyChangeSubject
{
  PropertyChangeSupport propertyChangeSupport;
  List<String> chatLogs;

  public ChatModel()
  {
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  @Override public List<String> getMessages()
  {
    return chatLogs;
  }

  @Override public void sendMessage(String message)
  {
    chatLogs.add(message);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(name,listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(name,listener);
  }
}
