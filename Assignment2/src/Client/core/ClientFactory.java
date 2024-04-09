package Client.core;

import Client.networking.Client;
import Client.networking.SocketClient;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;

public class ClientFactory {
  private static ClientFactory instance;
  private SocketClient client;

  private ClientFactory()
  {

  }

  public static ClientFactory getInstance()
  {
    if (instance == null)
    {
      instance = new ClientFactory();
    }
    return instance;
  }
  // create a new client
  public SocketClient createClient(String host, int port) throws IOException
  {
    Socket socket = new Socket(host, port);
    return new SocketClient (socket);
  }
}
