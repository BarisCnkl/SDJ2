package opg1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            Socket socket = new Socket("localhost", 2910); //Creating a Client socket
            ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream()); //Createing Output to the server
            ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream()); //Creating the input From server

            while(true)
            {
                System.out.println("Write");
                String stringToSend = scanner.nextLine();
                if (stringToSend.equals("exit"))
                {
                    break;
                }

                outToServer.writeObject(stringToSend); //Send to server

                String o = (String) inFromServer.readObject(); //Reads From server

                System.out.println(o); //printing
            }
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
