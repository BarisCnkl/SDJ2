package server.networking;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class SocketServer
{
  private final List<Handler> connections;

  public SocketServer()
  {
    this.connections = new ArrayList<>();
  }

  public void add(Handler serverConnection)
  {
    connections.add(serverConnection);
  }

  public void broadcast(String message) throws IOException
  {
    for (Handler connection : connections)
    {
      connection.send(message);
    }
  }
}
