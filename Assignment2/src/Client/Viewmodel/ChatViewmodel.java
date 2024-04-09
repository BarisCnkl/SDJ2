package Client.Viewmodel;

import Client.model.ChatModel;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

public class ChatViewmodel
{
    ChatModel model;
    List<String> messageLogs;

    StringProperty messageProperty;

    public ChatViewmodel(ChatModel model)
    {
        this.model = model;
        messageLogs = FXCollections.observableArrayList();
        messageProperty = new SimpleStringProperty();
        model.addPropertyChangeListener("New Message", this::refreshlogs);
    }

    public void refreshlogs(PropertyChangeEvent event)
    {
        messageLogs.clear();
        messageLogs.addAll((List<String>) event.getNewValue());

    }

    public StringProperty messagePropertyProperty() {
        return messageProperty;
    }

    public List<String> getMessageLogs() {
        return messageLogs;
    }

    public void sendMessage()
    {
        model.sendMessage(messageProperty.get());
    }
}
