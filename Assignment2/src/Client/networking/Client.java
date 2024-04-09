package Client.networking;

import java.util.List;

public interface Client {
  void sendMessage(String message);
  List<String> getMessageLog(String message);
}
