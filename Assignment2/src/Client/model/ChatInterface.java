package Client.Model;

import TransferObjects.InputOutput;
import java.util.List;

public interface ChatInterface
{
    List<String> getChatLogs();
    void sendMessage(String message);
}
