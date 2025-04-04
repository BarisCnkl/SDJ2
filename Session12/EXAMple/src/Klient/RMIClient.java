package Klient;

import Server.MyRemoteInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
  public static void main(String[] args) {
    try {
      Registry registry = LocateRegistry.getRegistry("localhost");
      MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("Hello");
      String response = stub.sayHello();
      System.out.println("Response: " + response);
    } catch (Exception e) {
      System.err.println("Client exception: " + e.toString());
      e.printStackTrace();
    }
  }
}
