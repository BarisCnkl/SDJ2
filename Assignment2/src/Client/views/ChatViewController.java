package Client.views;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class ChatViewController
{
  @FXML Button sendButton;
  @FXML ListView messageLogs;

  @FXML TextField messageField;
  ChatViewModel viewModel;

  public ChatViewController(ChatViewModel viewModel)
  {
    this.viewModel = viewModel;
  }
  public void initialize()
  {
    messageField.textProperty().bindBidirectional(viewModel.messagePropertyProperty());
    messageLogs.setItems((ObservableList) viewModel.getMessageLogs());
  }
  public void onSendButtonPressed()
  {
    viewModel.sendMessage();
  }
}
