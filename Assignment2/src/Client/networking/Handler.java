package Client.networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler implements Runnable
{

  private final ObjectOutputStream outToServer;
  private final ObjectInputStream inFromServer;

  public Handler(Socket socket) throws IOException
  {
    outToServer = new ObjectOutputStream(socket.getOutputStream());
    inFromServer = new ObjectInputStream(socket.getInputStream());
  }

  @Override
  public void run()
  {
    try
    {
      while (true)
      {
        String message = (String) inFromServer.readObject();
        System.out.println("Message received: " + message);
      }
    }
    catch (IOException | ClassNotFoundException e)
    {
      throw new RuntimeException(e);
    }
  }

  public void send(String message) throws IOException
  {
    outToServer.writeObject(message);
  }
}