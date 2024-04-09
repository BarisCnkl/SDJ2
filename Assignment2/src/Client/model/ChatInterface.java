package Client.model;

import TransferObjects.InputOutput;

import java.util.List;

public interface ChatInterface
{
  List<String> getMessages();
  void sendMessage(String message);
}
