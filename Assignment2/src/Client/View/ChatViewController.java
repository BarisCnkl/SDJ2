package Client.View;

import Client.Viewmodel.ChatViewmodel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class ChatViewController
{
    @FXML
    Button sendButton;

    @FXML
    ListView<String> messageLogs;

    @FXML
    TextField messageField;

    ChatViewmodel viewmodel;

    public ChatViewController(ChatViewmodel viewmodel) {
        this.viewmodel = viewmodel;
    }

    public void initialize()
    {
        messageField.textProperty().bindBidirectional(viewmodel.messagePropertyProperty());
        messageLogs.setItems((ObservableList) viewmodel.getMessageLogs());
    }

    public void onSendButtonPressed()
    {
        viewmodel.sendMessage();
        messageField.clear();
    }
}
