package server;

import server.networking.Handler;
import server.networking.SocketServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.ServerSocket;

public class RunServer
{
  public static void main(String[] args)
  {
    System.out.println("Starting server...");
    try
    {
      ServerSocket welcomeSocket = new ServerSocket(2910);
      SocketServer connectionPool = new SocketServer();

      while (true)
      {
        Socket socket = welcomeSocket.accept();
        Handler serverConnection = new Handler(socket, connectionPool);
        connectionPool.add(serverConnection);
        System.out.println("Client connected");
        new Thread(serverConnection).start();
      }
    }
    catch (IOException e)
    {
      throw new RuntimeException(e);
    }
  }
}
