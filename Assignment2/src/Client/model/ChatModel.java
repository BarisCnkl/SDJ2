package Client.model;

import TransferObjects.InputOutput;
import util.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class ChatModel implements PropertyChangeSubject
{
    PropertyChangeSupport support;
    List<String> chatLogs;

    public ChatModel()
    {
        support = new PropertyChangeSupport(this);
        chatLogs = new ArrayList<>();
    }


    public List<String> getChatLogs()
    {
        return chatLogs;
    }

    public void sendMessage(String message)
    {
        chatLogs.add(message);
        support.firePropertyChange("New Message", null, chatLogs);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    @Override
    public void addPropertyChangeListener(String name, PropertyChangeListener listener) {
        support.addPropertyChangeListener(name,listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String name, PropertyChangeListener listener) {
        support.removePropertyChangeListener(name,listener);
    }
}
