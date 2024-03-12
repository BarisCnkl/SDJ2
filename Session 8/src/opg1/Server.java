package opg1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        System.out.println("Starting server...");
        try
        {
            ServerSocket welcomeSocket = new ServerSocket(2910);
            while (true)
            {
                Socket socket = welcomeSocket.accept();
                System.out.println("Clientconnected" + socket.getInetAddress());

                ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream outToClient = new ObjectOutputStream(socket.getOutputStream());

                String o = (String) inFromClient.readObject();
                while (!"Stop".equals(o))
                {
                    System.out.println("Received: " + o);

                    String answer = o.toUpperCase();

                    outToClient.writeObject(answer);
                    o = (String) inFromClient.readObject();
                }
            }
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}