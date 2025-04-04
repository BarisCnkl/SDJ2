package Client.networking;

import java.util.List;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    try
    {
      Socket socket = new Socket("localhost", 2910);
      Handler clientConnection = new Handler(socket);
      new Thread(clientConnection).start();

      while(true)
      {
        System.out.println("Enter a message: ");
        String stringToSend = scanner.nextLine();
        clientConnection.send(stringToSend);
      }
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }
}
